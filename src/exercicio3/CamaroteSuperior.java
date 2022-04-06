package exercicio3;

public class CamaroteSuperior extends Vip{
	private double superior = acrecimo + 30;
	
	/**
	 * Permite a impressão do valor Camarote Superior do ingresso.
	 * imprimirValor
	 */
	@Override
	public double imprimirValor() {
		System.out.println("Valor cobrado a mais pelo camarote: "+superior);
		return superior;
	}
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
	
}