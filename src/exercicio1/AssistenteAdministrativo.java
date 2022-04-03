package exercicio1;

/**
 * Classe para criação de assistentes administrativos
 * 
 * AssistenteAdministrativo
 * 
 * @author Victor Gabriel Alves Pereira
 * @author Victor Matheus Carvalho Pinheiro
 */
public class AssistenteAdministrativo extends Assistente {
  private String turno;
  private float adicionalNoturno;

  /**
   * Retorna o turno existente do atual assistente administrativo
   * 
   * @return o tipo de turno
   */
  public String getTurno() {
    return turno;
  }

  /**
   * Define um turno no atual assistente administrativo
   * 
   * @param turno turno a ser definido
   */
  public void setTurno(String turno) {
    this.turno = turno;
  }

  /**
   * Retorna o adicional noturno existente do atual assistente administrativo
   * 
   * @return adicional noturno com base na CLT
   */
  public float getAdicionalNoturno() {
    return adicionalNoturno;
  }

  /**
   * Define um adicional noturno no atual assistente administrativo
   * 
   * @param adicionalNoturno
   */
  public void setAdicionalNoturno(float adicionalNoturno) {
    this.adicionalNoturno = adicionalNoturno;
  }

  /**
   * Exibe os dados do atual assistente administrativo
   */
  @Override
  public void exibirDados() {
    System.out.println("Assistente Técnico:");
    System.out.println("Matrícula: " + this.getMatricula());
    System.out.println("Nome: " + this.getNome());
    System.out.println("Idade: " + this.getIdade());
    System.out.println("Salario: " + this.getSalario());
    System.out.println("Turno: " + this.getTurno());
    System.out.println("Adicional noturno: " + this.getAdicionalNoturno());
  }
}
