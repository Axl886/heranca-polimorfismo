package exercicio4;

public class Novo extends Imovel {
  public float adicionalPreco;

  public float getAdicionalPreco() {
    return adicionalPreco;
  }

  public void setAdicionalPreco(float adicionalPreco) {
    this.adicionalPreco = adicionalPreco;
  }

  public void imprimirAdicionalPreco() {
    this.setPreco(this.getAdicionalPreco() + this.getPreco());
    System.out.println("Preço do imóvel: " + this.getPreco());
  }
}
