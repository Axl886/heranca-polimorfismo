package exercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Gato cat = new Gato(" ", " ");
		Cachorro dog = new Cachorro(" ", " ");
		Scanner ler = new Scanner(System.in);
		String name;
		
		System.out.println("Qual seu animal preferido, gato ou cachorro?");
		System.out.println(" | Digite Gato ou Cachorro | ");
			name = ler.next();
			
		if(name.equals("Gato")) {
			System.out.println("Seu animal preferido fala:");
			cat.falar();
		} else if(name.equals("Cachorro")) {
			System.out.println("Seu animal preferido fala: ");
			dog.falar();
		}else {
			System.out.println("Nome não reconhecido :/, tente novamente usando Gato ou Cachorro.");
		}
	  }
	}


