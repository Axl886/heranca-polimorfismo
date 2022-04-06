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
  * Método construtor
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
	 * Define um nome na pessoa pobre
	 * 
	 * @param nome nome da pessoa pobre
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * Retorna a idade existente da pessoa pobre
	 * 
	 * @return idade
     */
	public int getIdade() {
		return idade;
	}
   /**
    * Define a idade da pessoa pobre
    * 
    * @param idade idade a ser definida
    */
	public void setIdade(int idade) {
		this.idade = idade;
	}
	/**
	 * Exibe uma mensagem.
	 * 
	 */
	public void trabalha() {
		System.out.println("|Você não tem uma boa renda mensal.|");
	}
}
