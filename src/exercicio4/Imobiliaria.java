package exercicio4;

import java.util.Scanner;

/**
 * Classe para registro de imóveis definindo preço e endereço do imóvel
 * 
 * Imobiliaria
 * 
 * @author Victor Gabriel Alves Pereira
 * @author Victor Matheus Carvalho Pinheiro
 */
public class Imobiliaria {

  /**
   * Interação usuário-terminal para registro de imóveis
   */
  public static void main() {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Deseja registrar um imóvel? (S/n)");
      String resposta = scanner.nextLine();

      if (resposta.equals("n")) {
        System.out.println("Tenha um bom dia!");
        scanner.close();
        System.exit(0);
      }

      System.out.println("Tipo de imóvel: (novo/velho)");
      System.out.println("Imóveis velhos: Antes de 2000");
      System.out.println("Imóveis novos: A partir de 2000");
      String tipoImovel = scanner.nextLine();

      if (tipoImovel.equals("novo") || tipoImovel.equals("Novo")) {
        Novo novoImovel = new Novo();

        System.out.println("Preço atual do imóvel:");
        novoImovel.setPreco(scanner.nextFloat());
        System.out.println("Endereço do imóvel:");
        scanner.nextLine();
        novoImovel.setEndereco(scanner.nextLine());

        novoImovel.imprimirAdicionalPreco();
        System.out.println("Endereço do imóvel: " + novoImovel.getEndereco());

      } else if (tipoImovel.equals("velho") || tipoImovel.equals("Velho")) {
        Velho velhoImovel = new Velho();

        System.out.println("Preço atual do imóvel:");
        velhoImovel.setPreco(scanner.nextFloat());
        System.out.println("Endereço do imóvel:");
        scanner.nextLine();
        velhoImovel.setEndereco(scanner.nextLine());

        velhoImovel.imprimirDesconto();
        System.out.println("Endereço do imóvel: " + velhoImovel.getEndereco());
      } else {
        System.out.println("Opção não identificada.");
      }

      System.out.println("Deseja sair do programa? (S/n)");
      if (scanner.nextLine().equals("S"))
        System.exit(0);
    }
  }
}
