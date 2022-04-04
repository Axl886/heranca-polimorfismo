package exercicio4;

public class Velho extends Imovel {
  public void imprimirDesconto() {
    this.setPreco(this.getPreco() * 0.85f);
    System.out.println("Desconto: 2500");
    System.out.println("Preço com desconto: " + this.getPreco());
  }
}
