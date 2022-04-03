package exercicio2p2;

public class Pobre extends Pessoa {

	public Pobre(String nome, int idade) {
		super(nome, idade);
	}

	public void trabalha() {
		System.out.println("|Você não tem uma boa renda mensal.|");
	}
}
