package exercicio2p2;

public class Pobre extends Pessoa {

	public Pobre(String nome, int idade) {
		super(nome, idade);
	}

	public void trabalha() {
		System.out.println("|Voc� n�o tem uma boa renda mensal.|");
	}
}
