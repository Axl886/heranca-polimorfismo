package exercicio3;

/**
 * Classe filha para impress�o de valor normal do ingresso.
 * 
 * Normal
 * 
 * @author Victor Gabriel Alves Pereira
 * @author Victor Matheus Carvalho Pinheiro
 */
public class Normal extends Ingresso {
	/**
	 * Permite a impress�o do valor normal do ingresso.
	 * imprimirValor
	 */
	@Override
	public double imprimirValor() {
		System.out.println("Valor de ingresso normal " + dinheiro);
		return 0;
	}
}
