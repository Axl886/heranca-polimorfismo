package exercicio2p2;

/**
 * Classe para interação com o usuário.
 * 
 * Main
 * 
 * @author Victor Gabriel Alves Pereira
 * @author Victor Matheus Carvalho Pinheiro
 */

import java.util.Scanner;


 /**
  * Interação do usuário com terminal
  */

public class Main {

	public static void main(String[] args) {
		Pobre pobre = new Pobre(" ", 0);
		Rica rica = new Rica(" ", 0);
		Miseravel mise = new Miseravel(" ", 0);
		Scanner ler = new Scanner(System.in);
		
		float renda;
		
		System.out.println("Digite sua renda, antes de começarmos.");
			renda = ler.nextFloat();
		
		
			if(999 > renda){
				System.out.println("Digite seu nome ");
					mise.setNome(ler.next());
				System.out.println("Digite sua idade");
					mise.setIdade(ler.nextInt());
				System.out.println(mise.getNome()+" de "+mise.getIdade()+", você é miserável");
					mise.Mendiga();
			} else if (4999 > renda) {
				System.out.println("Digite seu nome");
					pobre.setNome(ler.next());
				System.out.println("Digite sua idade");
					pobre.setIdade(ler.nextInt());
				System.out.println(pobre.getNome()+" de "+pobre.getIdade()+", você é pobre");
				pobre.trabalha();
			}
		      else if (renda > 5000) {
		    	System.out.println("Digite seu nome ");
		    		rica.setNome(ler.next());
		    	System.out.println("Digite sua idade: ");
		    		rica.setIdade(ler.nextInt());
		    	System.out.println(rica.getNome()+" de "+rica.getIdade()+", você é rica");
		    	    rica.fazCompras();
		   }
		}
     }

