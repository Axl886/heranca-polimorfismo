package exercicio1;

/**
 * Classe para implementações de novos funcionários
 * 
 * Funcionario
 * 
 * @author Victor Gabriel Alves Pereira
 * @author Victor Matheus Carvalho Pinheiro
 */
public abstract class Funcionario {
  private String nome;
  private int idade;
  private float salario;

  /**
   * Retorna o nome existente do atual funcionário
   * 
   * @return nome do funcionário
   */
  public String getNome() {
    return nome;
  }

  /**
   * Define um nome no atual funcionário
   * 
   * @param nome nome a ser definido
   */
  public void setNome(String nome) {
    this.nome = nome;
  }

  /**
   * Retorna a idade existente do atual funcionário
   * 
   * @return idade
   */
  public int getIdade() {
    return idade;
  }

  /**
   * Define uma idade no atual funcionário
   * 
   * @param idade idade a ser definida
   */
  public void setIdade(int idade) {
    this.idade = idade;
  }

  /**
   * Retorna o salário existente do atual funcionário
   * 
   * @return salário no formato decimal
   */
  public float getSalario() {
    return salario;
  }

  /**
   * Define um salário no atual funcionário
   * 
   * @param salario salário a ser definido
   */
  public void setSalario(float salario) {
    this.salario = salario;
  }

  /**
   * Permite que outras classes possam exibir dados a partir do método abstrato
   * exibirDados
   */
  public abstract void exibirDados();
}
