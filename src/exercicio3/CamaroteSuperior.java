package exercicio3;

/**
 * Classe que define valor de pre�o para o camarote superior e permite
 * imprimir este valor.
 * 
 * CamaroteSuperior
 * 
 * @author Victor Gabriel Alves Pereira
 * @author Victor Matheus Carvalho Pinheiro
 * 
 */
public class CamaroteSuperior extends Vip {
	private double superior = acrecimo + 30;

	/**
	 * Retorna o acrecimo no valor
	 * 
	 * @return acrecimo
	 */
	public double getSuperior() {
		return superior;
	}

	/**
	 * Define o superior no valor
	 * 
	 * @param superior
	 */
	public void setSuperior(double superior) {
		this.superior = superior;
	}

	/**
	 * Permite a impress�o do valor Camarote Superior do ingresso.
	 */
	@Override
	public double imprimirValor() {
		System.out.println("Valor cobrado a mais pelo camarote: " + superior);
		return superior;
	}
}