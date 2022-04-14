package exercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

import exercicio4.Novo;
import exercicio4.Velho;
import validacao.Validacao;

public class ExercicioQuatroView {
  public static Integer definirTipoImovel(Scanner scanner) {
    do {
      try {
        System.out.println("Tipo de imóvel: (1 ou 2)");
        System.out.println("1 - Imóveis velhos: Antes de 2000");
        System.out.println("2 - Imóveis novos: A partir de 2000");
        int tipoImovel = scanner.nextInt();

        if (tipoImovel <= 0 || tipoImovel > 2)
          throw new NumberOutOfRangeException("Tipo de imóvel não reconhecido");

        return tipoImovel;
      } catch (InputMismatchException e) {
        scanner.nextLine();
        System.out.println("Não é permitido valores não numéricos");
        continue;
      } catch (NumberOutOfRangeException e) {
        scanner.nextLine();
        System.out.println(e.getMessage());
        continue;
      }
    } while (true);
  }

  public static float definirPreco(Scanner scanner) throws NullPointerException, InputMismatchException {
    System.out.println("Preço atual do imóvel:");
    return scanner.nextFloat();
  }

  public static String definirEndereco(Scanner scanner) throws NullPointerException, InputMismatchException {
    System.out.println("Endereço do imóvel:");
    scanner.nextLine();
    String endereco = scanner.nextLine();

    if (endereco.isBlank())
      throw new NullPointerException("Endereço não pode ser vazio!");

    return endereco;
  }

  public static void registrarNovoImovel(Scanner scanner) {
    Novo novoImovel = new Novo();
    float preco = 0;
    do {
      try {
        preco = definirPreco(scanner);
        break;
      } catch (NullPointerException e) {
        scanner.nextLine();
        System.out.println("Não são permitidos valores vazios");
        continue;
      } catch (InputMismatchException e) {
        scanner.nextLine();
        System.out.println("Não são permitidos valores não numéricos");
        continue;
      }
    } while (true);

    String endereco = null;
    do {
      try {
        endereco = definirEndereco(scanner);
        break;
      } catch (NullPointerException e) {
        System.out.println(e.getMessage());
        continue;
      }
    } while (true);

    novoImovel.setEndereco(endereco);
    novoImovel.setPreco(preco);
    novoImovel.imprimirAdicionalPreco();
    System.out.println("Endereço do imóvel: " + novoImovel.getEndereco());
  }

  public static void registrarVelhoImovel(Scanner scanner) {
    Velho velhoImovel = new Velho();
    float preco = 0;
    do {
      try {
        preco = definirPreco(scanner);
        break;
      } catch (NullPointerException e) {
        scanner.nextLine();
        System.out.println("Não são permitidos valores vazios");
        continue;
      } catch (InputMismatchException e) {
        scanner.nextLine();
        System.out.println("Não são permitidos valores não numéricos");
        continue;
      }
    } while (true);

    String endereco = null;
    do {
      try {
        endereco = definirEndereco(scanner);
        break;
      } catch (NullPointerException e) {
        System.out.println(e.getMessage());
        continue;
      }
    } while (true);

    velhoImovel.setEndereco(endereco);
    velhoImovel.setPreco(preco);
    velhoImovel.imprimirDesconto();
    System.out.println("Endereço do imóvel: " + velhoImovel.getEndereco());
  }

  public static void main() {
    while (true) {
      Scanner scanner = new Scanner(System.in);
      int opcao = 0;
      try {
        System.out.println("Menu de opções");
        System.out.println("1 - Registrar imóvel");
        System.out.println("2 - Sair");
        opcao = scanner.nextInt();
      } catch (InputMismatchException e) {
        System.out.println("Valor não numérico");
        scanner.nextLine();
        continue;
      }

      switch (opcao) {
        case 1:
          String resposta = null;
          do {
            try {
              System.out.println("Deseja registrar um imóvel? (S/n)");
              resposta = scanner.next();

              if (resposta.isBlank())
                throw new NullPointerException("Não é permitido nomes vazios");

              if (Validacao.isNumeric(resposta))
                throw new InputMismatchException("Não é permitido inserir nomes com números ou alfanuméricos");

              if (!(resposta.equals("s") || resposta.equals("S") || resposta.equals("n") || resposta.equals("N")))
                throw new InputMismatchException("Insira somente S ou n");

              break;
            } catch (NullPointerException | InputMismatchException e) {
              System.out.println(e.getMessage());
              continue;
            }
          } while (true);

          if (resposta.equals("n") || resposta.equals("N")) {
            System.out.println("Tenha um bom dia!");
            scanner.close();
            System.exit(0);
          }

          int tipoImovel = definirTipoImovel(scanner);
          if (tipoImovel == 1) {
            registrarNovoImovel(scanner);
          } else if (tipoImovel == 2) {
            registrarVelhoImovel(scanner);
          }
          break;

        case 2:
          System.out.println("Tenha um dia excelente!");
          System.exit(0);

        default:
          System.out.println("Opção não reconhecida");
          break;
      }
    }
  }
}
