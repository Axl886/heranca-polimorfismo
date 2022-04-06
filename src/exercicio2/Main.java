package exercicio2;

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
	
  /**
   * Interação do usuário com terminal
   */

	public static void main(String[] args) {
		Gato cat = new Gato(" ", " ");
		Cachorro dog = new Cachorro(" ", " ");
		Scanner ler = new Scanner(System.in);
		String animal;
		
		
		System.out.println("| Qual seu animal preferido, Gato ou Cachorro? |");
		    animal = ler.nextLine();
		System.out.println("Qual o nome do seu animal?");
			cat.setNome(ler.nextLine());
			dog.setNome(ler.nextLine());
			
		System.out.println(" | Qual a raça do seu animal? | ");
			cat.setRaca(ler.nextLine());
			dog.setRaca(ler.nextLine());
			
		if(animal.equals("Gato")) {
			System.out.println("Seu animal preferido se chama "+cat.getNome()+", é da raça "+cat.getRaca());
			System.out.println("Seu animal preferido fala:");
			cat.falar();
			System.out.println("\n");
			cat.caminhar();
			
		} else if(animal.equals("Cachorro")) {
			System.out.println("Nome: "+dog.getNome());
			System.out.println("Raça:"+dog.getRaca());
			dog.falar();
			dog.caminhar();
		}else {
			System.out.println("Nome não reconhecido :/, tente novamente usando Gato ou Cachorro.");
		}
	  }
	}


