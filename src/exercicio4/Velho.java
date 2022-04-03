package exercicio4;

public class Velho extends Imovel {
  public float desconto;

  public float getDesconto() {
    return desconto;
  }

  public void setDesconto(float desconto) {
    this.desconto = desconto;
  }

  public void imprimirDesconto() {
    this.setPreco(this.getPreco() - this.getDesconto());
    System.out.println("Desconto: " + this.getDesconto());
    System.out.println("Preço com desconto: " + this.getPreco());
  }
}
