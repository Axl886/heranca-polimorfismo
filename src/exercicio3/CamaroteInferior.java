package exercicio3;

public class CamaroteInferior extends Vip {
	String local;
	/**
	 * Permite a impressão do valor Camarote Superior do ingresso.
	 * imprimirValor
	 */
	@Override
	public double imprimirValor() {
		System.out.println("Valor total do ingresso: "+acrecimo);
		return 0;
	}
	/**
	 * Retorna o local inserido pelo usuário
	 * 
	 * @return local
	 */
	public String getLocal() {
		return local;
	}
	/**
	 * Retorna o local inserido
	 * 
	 * @return local
	 */
	public void setLocal(String local) {
		this.local = local;
	}
	/**
	 * Permite mostrar o local indicado pelo usuário.
	 * mostrarLocal
	 */
	public void mostrarLocal() {
		System.out.println("|Localização|");
		System.out.println(" Local : "+getLocal());
	}
	
	

}
