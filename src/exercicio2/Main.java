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
		    animal = ler.next();
			
		if(animal.equals("Gato")) {
			System.out.println("Qual o nome do seu gatinho?");
				cat.setNome(ler.next());
			System.out.println("Qual a ra�a do bichano?");
				cat.setRaca(ler.next());
			System.out.println(cat.getNome()+" � da ra�a "+cat.getRaca());
			cat.falar();
			cat.caminhar();
		} else if(animal.equals("Cachorro")) {
			System.out.println("Qual o nome do cachorrinho?");
				dog.setNome(ler.next());
			System.out.println("Qual a ra�a do seu dog?");
				dog.setRaca(ler.next());
			System.out.println("\n");
			System.out.println(dog.getNome()+" � da ra�a "+dog.getRaca());
			dog.falar();
			dog.caminhar();
		}else {
			System.out.println("Nome n�o reconhecido :/, tente novamente usando Gato ou Cachorro.");
		}
	  }
	}


