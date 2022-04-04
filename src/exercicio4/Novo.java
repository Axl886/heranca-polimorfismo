package exercicio4;

/**
 * Classe para registro de novos imóveis
 * 
 * Novo
 * 
 * @author Victor Gabriel Alves Pereira
 * @author Victor Matheus Carvalho Pinheiro
 */
public class Novo extends Imovel {
  /**
   * Imprime o novo preço com o adicional de preço
   */
  public void imprimirAdicionalPreco() {
    this.setPreco(this.getPreco() * 1.25f);
    System.out.println("Preço do imóvel: " + this.getPreco());
  }
}
