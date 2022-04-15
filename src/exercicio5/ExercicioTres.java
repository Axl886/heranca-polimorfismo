package exercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

import exercicio3.CamaroteInferior;
import exercicio3.CamaroteSuperior;
import exercicio3.Normal;
import exercicio3.Vip;

/**
 * Classe que permite ao usu�rio selecionar op��es relacionadas ao ingresso.
 * 
 * Main
 * 
 * @author Victor Gabriel Alves Pereira
 * @author Victor Matheus Carvalho Pinheiro
 * 
 */
public class ExercicioTres {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    while (true) {
      int option = 0;
      try {
        System.out.println("-----------------------------");
        System.out.println("| Bem-vindo a Fulano Festas |");
        System.out.println("-----------------------------");
        System.out.println("1 - | Normal |");
        System.out.println("2 - |  VIP   |");
        System.out.println("3 - |  Sair  |");
        option = ler.nextInt();
      } catch (InputMismatchException e) {
        ler.nextLine();
        System.out.println("Valor n�o num�rico");
        continue;
      }

      switch (option) {
        case 1:// mostra o valor normal do ingresso.
          Normal normal = new Normal();
          System.out.println("Voc� escolhou o valor de ingresso normal.\n");
          normal.imprimirValor();
          break;

        case 2:// mostra o valor VIP do ingresso e permite escolher as op��es.
          Vip vip = new Vip();
          System.out.println("Voc� optou pela op��o VIP.");
          vip.imprimirValor();

          int opcao;
          System.out.println("|Sess�o VIP|");
          System.out.println("Digite 1 para Camarote Superior ou 2 para Camarote Inferior");
          opcao = ler.nextInt();

          if (opcao == 1) {
            CamaroteSuperior camsup = new CamaroteSuperior();
            System.out.println("Op��o Camarote Superior selecionada.");
            camsup.imprimirValor();
            System.out.println("\n");
          } else if (opcao == 2) {
            CamaroteInferior caminf = new CamaroteInferior();
            System.out.println("Op��o Camarote Inferior selecionada.");
            caminf.imprimirValor();
            System.out.println("\n");
            caminf.mostrarLocal();
          } else {
            System.out.println("Valor n�o encontrado :/,Escolha uma das op��es pedidas.");
          }
          break;

        case 3: // sai da intera��o.
          ler.close();
          System.out.println("Voc� desejou sair, at� outro dia!");
          System.exit(0);

        default:
          System.out.println("N�o foi poss�vel encontrar esta op��o.");
          break;
      }
    }
  }
}
