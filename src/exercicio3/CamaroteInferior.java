package exercicio3;

/**
 * Define valores para o pre�o, local e imprime os mesmos.
 * 
 * CamaroteInferior
 * 
 * @author Victor Gabriel Alves Pereira
 * @author Victor Matheus Carvalho Pinheiro
 * 
 */
public class CamaroteInferior extends Vip {
	public String local = "Inferior";

	/**
	 * Retorna o local inserido pelo usu�rio
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
	 * Permite a impress�o do valor Camarote Superior do ingresso.
	 * imprimirValor
	 */
	@Override
	public double imprimirValor() {
		System.out.println("Valor total do ingresso: " + acrecimo);
		return 0;
	}

	/**
	 * Permite mostrar o local indicado pelo usu�rio.
	 * mostrarLocal
	 */
	public void mostrarLocal() {
		System.out.println("|Localiza��o|");
		System.out.println(" Local : " + getLocal());
	}
}
