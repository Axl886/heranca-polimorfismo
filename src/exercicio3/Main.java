package exercicio3;


import java.util.Scanner;

/**
 * Classe para interação com o usuário.
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
			System.out.println("\nSelecione as opções");
			System.out.println(" |1 - Normal|");
			System.out.println(" |2 - VIP   |");
			int option = ler.nextInt();
			
		switch(option) {
		 case 1:
			 Normal normal = new Normal();
			 System.out.println("Você escolhou o valor de ingresso normal.");
			 normal.imprimirValor();
			 
		 break;
		 
		 case 2: 
			 Vip vip = new Vip();
			 System.out.println("Você optou pela opção VIP.");
			 vip.imprimirValor();
			 
			 int opcao;
			 System.out.println("|Sessão VIP|");
			 System.out.println("Digite 1 para Camarote Superior ou 2 para Camarote Inferior");
			 	opcao = ler.nextInt();
			 
			 if(opcao == 1) {
				 CamaroteSuperior camsup = new CamaroteSuperior();
				 System.out.println("Opção Camarote Superior selecionada.");
				 	camsup.imprimirValor();
				 System.out.println("\n");
			 }else if (opcao == 2) {
				 CamaroteInferior caminf = new CamaroteInferior();
				 System.out.println("Opção Camarote Inferior selecionada.");
				 	caminf.imprimirValor();
				 System.out.println("\n");
			 } else {
				 System.out.println("Valor não encontrado :/,Escolha uma das opções pedidas.");
			 }
			 
		 break;
		 
		}
	   }
	  }
     }
