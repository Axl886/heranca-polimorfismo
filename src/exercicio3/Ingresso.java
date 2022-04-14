package exercicio3;

/**
 * Classe abstrata para imprimir valor, alterar e acessar o valor.
 * 
 * Ingresso
 * 
 * @author Victor Gabriel Alves Pereira
 * @author Victor Matheus Carvalho Pinheiro
 */
public abstract class Ingresso {
	protected double dinheiro = 100;

	/**
	 * Permite que outras classes imprimam o valor.
	 */
	public double imprimirValor() {
		return dinheiro;
	}

	/**
	 * Retorna o dinheiro existente
	 * 
	 * @return dinheiro
	 */
	public double getDinheiro() {
		return dinheiro;
	}

	/**
	 * Define o dinheiro
	 * 
	 * @param dinheiro dinheiro a ser definido
	 */
	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}

}