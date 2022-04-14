package exercicio2p2;

/**
 * Classe para exibir uma mensagem sobre uma pessoa Pobre.
 * 
 * Pobre
 * 
 * @author Victor Gabriel Alves Pereira
 * @author Victor Matheus Carvalho Pinheiro
 */
public class Pobre extends Pessoa {
	/**
	 * M�todo construtor
	 * 
	 * @param nome
	 * @param idade
	 */
	public Pobre(String nome, int idade) {
		super(nome, idade);
	}

	/**
	 * Retorna o nome existente da pessoa pobre
	 * 
	 * @return nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Exibe uma mensagem.
	 */
	public void trabalha() {
		System.out.println("|Voc� n�o tem uma boa renda mensal.|");
	}
}
