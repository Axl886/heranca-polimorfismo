package exercicio2p2;

import java.util.InputMismatchException;

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

		int renda = 0;
		do {
			try {
				System.out.println("Digite sua renda, antes de começarmos.");
				renda = ler.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Somente números são permitidos.");
				ler.nextLine();
				continue;
			}
			break;
		} while (true);

			if(999 > renda){
				System.out.println("Digite seu nome");
				mise.setNome(ler.next());
				System.out.println("Digite sua idade");
				mise.setIdade(ler.nextInt());
				System.out.println(mise.getNome()+" de "+mise.getIdade()+" anos , você é miserável");
				mise.Mendiga();
			} else if (4999 > renda) {
				System.out.println("Digite seu nome");
				pobre.setNome(ler.next());
				System.out.println("Digite sua idade");
				pobre.setIdade(ler.nextInt());
				System.out.println(pobre.getNome()+" de "+pobre.getIdade()+" anos, você é pobre");
				pobre.trabalha();
			} else if (renda > 5000) {
				System.out.println("Digite seu nome ");
				rica.setNome(ler.next());
				System.out.println("Digite sua idade: ");
				rica.setIdade(ler.nextInt());
				System.out.println(rica.getNome()+" de "+rica.getIdade()+" anos, você é rica");
				rica.fazCompras();
			}else {
				System.out.println("Valor não reconhecido");
			}
	}
}



