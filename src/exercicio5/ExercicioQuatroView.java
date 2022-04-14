package exercicio5;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import exercicio4.Novo;
import exercicio4.Velho;
import validacao.Validacao;

/**
 * Classe para registrar imóveis novos e velhos
 * 
 * ExercicioQuatroView
 * 
 * @author Victor Gabriel Alves Pereira
 * @author Victor Matheus Carvalho Pinheiro
 */
public class ExercicioQuatroView {
  static List<Velho> imoveisVelhos = new LinkedList<Velho>();
  static List<Novo> imoveisNovos = new LinkedList<Novo>();

  /**
   * Verifica se o imóvel a ser registrado será novo ou velho
   * 
   * @param scanner para entrada e saída de dados
   * @return o tipo de imóvel
   */
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

  /**
   * Retorna o preço do imóvel a ser registrado, caso contrário, lança uma exceção
   * 
   * @param scanner para entrada e saída de dados
   * @return preco do imóvel
   * @throws NullPointerException   caso seja nulo
   * @throws InputMismatchException caso o usuário digite letras ou caracteres
   *                                especiais
   */
  public static float definirPreco(Scanner scanner) throws NullPointerException, InputMismatchException {
    System.out.println("Preço atual do imóvel:");
    return scanner.nextFloat();
  }

  /**
   * Retorna o endereço do imóvel a ser registrado, caso contrário, lança uma
   * exceção
   * 
   * @param scanner para entrada e saída de dados
   * @return endereço do imóvel a ser registrado
   * @throws NullPointerException   caso seja nulo
   * @throws InputMismatchException caso o usuário digite letras ou caracteres
   *                                especiais
   */
  public static String definirEndereco(Scanner scanner) throws NullPointerException, InputMismatchException {
    System.out.println("Endereço do imóvel:");
    scanner.nextLine();
    String endereco = scanner.nextLine();

    if (endereco.isBlank())
      throw new NullPointerException("Endereço não pode ser vazio!");

    return endereco;
  }

  /**
   * Realiza o registro de um novo imóvel solicitando o preço (realizado pelo
   * método definirPreco) e endereço (realizado pelo método definirEndereco) para
   * atribuir nos setters e imprime o preço atualizado (com adicional de preço) e
   * o endereço do novo imóvel
   * 
   * @param scanner para entrada e saída de dados
   */
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
    imoveisNovos.add(novoImovel);
  }

  /**
   * Realiza o registro de um velho imóvel solicitando o preço (realizado pelo
   * método definirPreco) e endereço (realizado pelo método definirEndereco) para
   * atribuir nos setters e imprime o preço atualizado (com desconto) e o endereço
   * do velho imóvel
   * 
   * @param scanner para entrada e saída de dados
   */
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
    imoveisVelhos.add(velhoImovel);
  }

  /**
   * Lista os imóveis velhos (se existirem) usando expressão lambda
   */
  public static void listarVelhosImoveis() {
    if (imoveisVelhos.isEmpty()) {
      System.out.println("Sem imóveis velhos registrados!");
      return;
    }

    System.out.println("Lista de imóveis:");
    imoveisVelhos.forEach(velhoImovel -> {
      System.out.println("Preço:" + velhoImovel.getPreco());
      System.out.println("Endereço:" + velhoImovel.getEndereco());
      System.out.println("\n");
    });
  }

  /**
   * Lista os imóveis novos (se existirem) usando expressão lambda
   */
  public static void listarNovosImoveis() {
    if (imoveisNovos.isEmpty()) {
      System.out.println("Sem imóveis novos registrados!");
      return;
    }

    System.out.println("Lista de imóveis:");
    imoveisNovos.forEach(novoImovel -> {
      System.out.println("Preço:" + novoImovel.getPreco());
      System.out.println("Endereço:" + novoImovel.getEndereco());
      System.out.println("\n");
    });
  }

  public static void main() {
    while (true) {
      Scanner scanner = new Scanner(System.in);
      int opcao = 0;
      try {
        System.out.println("Menu de opções");
        System.out.println("1 - Registrar imóvel");
        System.out.println("2 - Listar velhos imóveis");
        System.out.println("3 - Listar novos imóveis");
        System.out.println("4 - Sair");
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
            continue;
          }

          int tipoImovel = definirTipoImovel(scanner);
          if (tipoImovel == 1) {
            registrarVelhoImovel(scanner);
          } else if (tipoImovel == 2) {
            registrarNovoImovel(scanner);
          }
          break;

        case 2:
          listarVelhosImoveis();
          break;

        case 3:
          listarNovosImoveis();
          break;

        case 4:
          System.out.println("Tenha um dia excelente!");
          System.exit(0);

        default:
          System.out.println("Opção não reconhecida");
          break;
      }
    }
  }
}
