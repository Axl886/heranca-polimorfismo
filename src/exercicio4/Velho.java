package exercicio4;

/**
 * Classe para registro de velhos imóveis
 * 
 * Novo
 * 
 * @author Victor Gabriel Alves Pereira
 * @author Victor Matheus Carvalho Pinheiro
 */
public class Velho extends Imovel {
  /**
   * Imprime o desconto e preço atualizado com desconto
   */
  public void imprimirDesconto() {
    this.setPreco(this.getPreco() * 0.85f);
    System.out.println("Desconto: 2500");
    System.out.println("Preço com desconto: " + this.getPreco());
  }
}
