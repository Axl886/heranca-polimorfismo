package exercicio2p2;

/**
 * Classe para armazenar valores e exibir uma mensagem sobre uma pessoa Rica.
 * 
 * Pessoa
 * 
 * @author Victor Gabriel Alves Pereira
 * @author Victor Matheus Carvalho Pinheiro
 */

public abstract class Pessoa {
	String nome;
	int idade;

	/**
	 * Retorna o nome existente da pessoa
	 * 
	 * @return pessoa
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Define um nome na atual pessoa
	 * 
	 * @param nome nome da pessoa
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Retorna a idade existente de pessoa
	 * 
	 * @return idade
	 */
	public int getIdade() {
		return idade;
	}

	/**
	 * Define uma idade da atual pessoa
	 * 
	 * @param idade idade da pessoa
	 */
	public void setIdade(int idade) {
		this.idade = idade;
	}

	/**
	 * M�todo construtor referenciando os atributos.
	 * 
	 * @param nome
	 * @param idade
	 */
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
}
