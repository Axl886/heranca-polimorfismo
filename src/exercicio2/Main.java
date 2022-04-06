package exercicio2;

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
	
  /**
   * Intera��o do usu�rio com terminal
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
			
		System.out.println(" | Qual a ra�a do seu animal? | ");
			cat.setRaca(ler.nextLine());
			dog.setRaca(ler.nextLine());
			
		if(animal.equals("Gato")) {
			System.out.println("Seu animal preferido se chama "+cat.getNome()+", � da ra�a "+cat.getRaca());
			System.out.println("Seu animal preferido fala:");
			cat.falar();
			System.out.println("\n");
			cat.caminhar();
			
		} else if(animal.equals("Cachorro")) {
			System.out.println("Nome: "+dog.getNome());
			System.out.println("Ra�a:"+dog.getRaca());
			dog.falar();
			dog.caminhar();
		}else {
			System.out.println("Nome n�o reconhecido :/, tente novamente usando Gato ou Cachorro.");
		}
	  }
	}


