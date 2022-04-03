package exercicio2p2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Pobre pobre = new Pobre(" ", 0);
		Rica rica = new Rica(" ", 0);
		Miseravel mise = new Miseravel(" ", 0);
		Scanner ler = new Scanner(System.in);
		
		String name;
		int age;
		float renda;
		
		System.out.println("Digite seu nome");
			name = ler.next();
		System.out.println("Digite sua idade");
			age = ler.nextInt();
		System.out.println("Digite também sua renda mensal em reais. Exemplo: 1100,5300 etc.");
			renda = ler.nextFloat();
		
			if(999 > renda){
				System.out.println("Querido(a) "+name+" de "+age+" anos, recomendo uma mudança drástica de vida, ou procura ajuda. ");
				mise.Mendiga();
			} else if (4999 > renda) {
				System.out.println("Querido(a) "+name+" de "+age+" anos, apesar de não estar totalmente livre de dívidas, ainda tem um padrão de vida aceitável. ");
				pobre.trabalha();
			}
		      else if (renda > 5000) {
		    	System.out.println("Querido(a) "+name+" de "+age+" anos, você está com ótima aquisição financeira ");  
		    	rica.fazCompras();
		   }
		}
     }


