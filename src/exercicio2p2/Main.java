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
		
		System.out.println("Digite seu nome");
			pobre.setNome(ler.next());
			rica.setNome(ler.next());
			mise.setNome(ler.next());
		System.out.println("Digite sua idade");
			pobre.setIdade(ler.nextInt());
			rica.setIdade(ler.nextInt());
			mise.setIdade(ler.nextInt());
		System.out.println("Digite também sua renda mensal em reais. Exemplo: 1100,5300 etc.");
			renda = ler.nextFloat();
		
			if(999 > renda){
				System.out.println("Querido(a) "+mise.getNome()+" de "+mise.getIdade()+" anos, recomendo uma mudança drástica de vida, ou procura ajuda. ");
				mise.Mendiga();
			} else if (4999 > renda) {
				System.out.println("Querido(a) "+pobre.getNome()+" de "+pobre.getIdade()+" anos, apesar de não estar totalmente livre de dívidas, ainda tem um padrão de vida aceitável. ");
				pobre.trabalha();
			}
		      else if (renda > 5000) {
		    	System.out.println("Querido(a) "+mise.getNome()+" de "+mise.getIdade()+" anos, você está com ótima aquisição financeira ");  
		    	rica.fazCompras();
		   }
		}
     }

