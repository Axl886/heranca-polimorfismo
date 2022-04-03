package exercicio1;

/**
 * Classe para implementação de assistentes
 * 
 * Assistente
 * 
 * @author Victor Gabriel Alves Pereira
 * @author Victor Matheus Carvalho Pinheiro
 */
public abstract class Assistente extends Funcionario {
  private long matricula;

  /**
   * Retorna a matrícula existente do atual funcionário
   * 
   * @return matrícula
   */
  public long getMatricula() {
    return matricula;
  }

  /**
   * Define uma matrícula para o atual funcionário
   * 
   * @param matricula
   */
  public void setMatricula(long matricula) {
    this.matricula = matricula;
  }
}
