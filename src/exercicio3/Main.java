package exercicio3;


import java.util.Scanner;

/**
 * Classe para intera��o com o usu�rio.
 * 
 * Main
 * 
 * @author Victor Gabriel Alves Pereira
 * @author Victor Matheus Carvalho Pinheiro
 */


public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome = null;
	
		while(true) {
			System.out.println("|Bem-vindo a Fulano Festas|");
			System.out.println("\nSelecione as op��es");
			System.out.println(" |1 - Normal|");
			System.out.println(" |2 - VIP   |");
			int option = ler.nextInt();
			
		switch(option) {
		 case 1:
			 Normal normal = new Normal();
			 System.out.println("Voc� escolhou o valor de ingresso normal.");
			 normal.imprimirValor();
			 
		 break;
		 
		 case 2: 
			 Vip vip = new Vip();
			 System.out.println("Voc� optou pela op��o VIP.");
			 vip.imprimirValor();
			 
			 int opcao;
			 System.out.println("|Sess�o VIP|");
			 System.out.println("Digite 1 para Camarote Superior ou 2 para Camarote Inferior");
			 	opcao = ler.nextInt();
			 
			 if(opcao == 1) {
				 CamaroteSuperior camsup = new CamaroteSuperior();
				 System.out.println("Op��o Camarote Superior selecionada.");
				 	camsup.imprimirValor();
				 System.out.println("\n");
			 }else if (opcao == 2) {
				 CamaroteInferior caminf = new CamaroteInferior();
				 System.out.println("Op��o Camarote Inferior selecionada.");
				 	caminf.imprimirValor();
				 System.out.println("\n");
			 } else {
				 System.out.println("Valor n�o encontrado :/,Escolha uma das op��es pedidas.");
			 }
			 
		 break;
		 
		}
	   }
	  }
     }
