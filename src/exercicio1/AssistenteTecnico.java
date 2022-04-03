package exercicio1;

/**
 * Classe para criação de assistentes técnicos
 * 
 * AssistenteTecnico
 * 
 * @author Victor Gabriel Alves Pereira
 * @author Victor Matheus Carvalho Pinheiro
 */
public class AssistenteTecnico extends Assistente {
  private float bonusSalario;

  /**
   * Retorna o bônus de salário existente do atual assistente técnico
   * 
   * @return bônus de salário
   */
  public float getBonusSalario() {
    return bonusSalario;
  }

  /**
   * Define um bônus de salário no atual assistente técnico
   * 
   * @param bonusSalario
   */
  public void setBonusSalario(float bonusSalario) {
    this.bonusSalario = bonusSalario;
  }

  /**
   * Exibe os dados do atual assistente técnico
   */
  @Override
  public void exibirDados() {
    System.out.println("Assistente Técnico:");
    System.out.println("Matrícula: " + this.getMatricula());
    System.out.println("Nome: " + this.getNome());
    System.out.println("Idade: " + this.getIdade());
    System.out.println("Salario: " + this.getSalario());
    System.out.println("Bônus salário: " + this.getBonusSalario());
  }
}
