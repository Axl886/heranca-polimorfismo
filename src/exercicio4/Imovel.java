package exercicio4;

/**
 * Classe para implementação de imóveis
 * 
 * Imovel
 * 
 * @author Victor Gabriel Alves Pereira
 * @author Victor Matheus Carvalho Pinheiro
 */
public abstract class Imovel {
  private String endereco;
  private float preco;

  /**
   * Retorna o endereço existente do atual imóvel
   * 
   * @return String
   */
  public String getEndereco() {
    return endereco;
  }

  /**
   * Define um endereço para o atual imóvel
   * 
   * @param endereco
   */
  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  /**
   * Retorna o preço existente do atual imóvel
   * 
   * @return float
   */
  public float getPreco() {
    return preco;
  }

  /**
   * Define o preço do atual imóvel
   * 
   * @param preco
   */
  public void setPreco(float preco) {
    this.preco = preco;
  }
}
