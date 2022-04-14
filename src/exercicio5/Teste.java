package exercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Classe para interagir com os exercícios
 * 
 * Teste
 * 
 * @author Victor Gabriel Alves Pereira
 * @author Victor Matheus Carvalho Pinheiro
 */
public class Teste {
  /**
   * Método que realiza as interações com cada exercício perguntando qual
   * exercício o usuário deseja interagir
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      int option = 0;
      try {
        System.out.println("Menu de opções");
        System.out.println("1 - Exercício 1 - Funcionário");
        System.out.println("2 - Exercício 2 - Pessoa e Animal");
        System.out.println("3 - Exercício 3 - Ingresso");
        System.out.println("4 - Exercício 4 - Imóveis:");
        System.out.println("5 - Sair");
        option = scanner.nextInt();
      } catch (InputMismatchException e) {
        scanner.nextLine();
        System.out.println("Valor não numérico");
        continue;
      }

      switch (option) {
        case 1:
          ExercicioUmView.main();
          break;

        case 2:
          System.out.println("Soon!");
          break;

        case 3:
          System.out.println("Soon!");
          break;

        case 4:
          ExercicioQuatroView.main();
          break;

        case 5:
          scanner.close();
          System.out.println("Tenha um dia excelente!");
          System.exit(0);

        default:
          System.out.println("Opção não reconhecida");
          break;
      }
    }
  }
}
