package exercicio4;

public class Novo extends Imovel {
  public void imprimirAdicionalPreco() {
    this.setPreco(this.getPreco() * 1.25f);
    System.out.println("Preço do imóvel: " + this.getPreco());
  }
}
