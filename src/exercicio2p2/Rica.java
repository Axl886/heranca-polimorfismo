package exercicio2p2;

/**
 * Classe para exibir uma mensagem sobre uma pessoa rica.
 * 
 * Rica
 * 
 * @author Victor Gabriel Alves Pereira
 * @author Victor Matheus Carvalho Pinheiro
 */
public class Rica extends Pessoa {
	private double dinheiro = 500.000;

	/**
	 * M�todo construtor.
	 * 
	 * @param nome
	 * @param idade
	 */
	public Rica(String nome, int idade) {
		super(nome, idade);
	}

	/**
	 * Exibe uma mensagem
	 */
	public void fazCompras() {
		System.out.println("|Voc� tem uma �tima renda mensal.|");
	}

	/**
	 * Retorna o dinheiro do usu�rio
	 * 
	 * @return dinheiro
	 */
	public double getDinheiro() {
		return dinheiro;
	}

	/**
	 * Define uma valor para o dinheiro do usu�rio
	 * 
	 * @param dinheiro
	 */
	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}

}
