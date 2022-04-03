package exercicio1;

/**
 * Classe para criar gerentes
 * 
 * Gerente
 * 
 * @author Victor Gabriel Alves Pereira
 * @author Victor Matheus Carvalho Pinheiro
 */
public class Gerente extends Funcionario {

  /**
   * Exibe os dados do atual gerente
   */
  @Override
  public void exibirDados() {
    System.out.println("Gerente:");
    System.out.println("Nome: " + this.getNome());
    System.out.println("Idade: " + this.getIdade());
    System.out.println("Salario: " + this.getSalario());
  }
}
