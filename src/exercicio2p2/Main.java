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
		System.out.println("Digite tamb�m sua renda mensal em reais. Exemplo: 1100,5300 etc.");
		renda = ler.nextFloat();

		if (999 > renda) {
			System.out.println(
					"Querido(a) " + name + " de " + age + " anos, recomendo uma mudan�a dr�stica de vida, ou procura ajuda. ");
			mise.Mendiga();
		} else if (4999 > renda) {
			System.out.println("Querido(a) " + name + " de " + age
					+ " anos, apesar de n�o estar totalmente livre de d�vidas, ainda tem um padr�o de vida aceit�vel. ");
			pobre.trabalha();
		} else if (renda > 5000) {
			System.out.println("Querido(a) " + name + " de " + age + " anos, voc� est� com �tima aquisi��o financeira ");
			rica.fazCompras();
		}
		ler.close();
	}
}
