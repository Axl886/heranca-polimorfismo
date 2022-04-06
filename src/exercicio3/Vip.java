package exercicio3;	

/**
 * Classe filha para implementação de ingresso.
 * 
 * Vip
 * 
 * @author Victor Gabriel Alves Pereira
 * @author Victor Matheus Carvalho Pinheiro
 */

public class Vip extends Ingresso {
public double acrecimo = dinheiro + 50;
  /**
   * Permite a impressão de valor vip do ingresso.
   * imprimirValor
   */
   @Override
 public double imprimirValor() {
		System.out.println("O valor normal sofreu um acréscimo de R$50,00 reais. "+acrecimo);
		return acrecimo;
		
	}
   /**
    * Retorna o acrecimo
    * 
    * @return acrecimo
    */
 public double getAcrecimo() {
		return acrecimo;
	}
  /**
   * Define um acrecimo
   * 
   * @param acrecimo
   */
 public void setAcrecimo(double acrecimo) {
		this.acrecimo = acrecimo;
	}

}
