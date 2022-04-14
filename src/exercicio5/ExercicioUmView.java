package exercicio5;

import exercicio1.AssistenteAdministrativo;
import exercicio1.AssistenteTecnico;

/**
 * Classe para criar os objetos das classes AssistenteTecnico e
 * AssistenteAdministrativo, preencher os atributos e imprimir os seus valores
 * 
 * ExercicioUmView
 * 
 * @author Victor Gabriel Alves Pereira
 * @author Victor Matheus Carvalho Pinheiro
 */
public class ExercicioUmView {
  /**
   * Método para a criação dos objetos, inserção de valores estáticos por meio dos
   * métodos setters e impressão através do método exibirDados()
   */
  public static void main() {
    System.out.println("Exercício 1");

    // Criando um assistente administrativo
    AssistenteAdministrativo admin = new AssistenteAdministrativo();
    admin.setMatricula(3130456);
    admin.setNome("André Félix");
    admin.setIdade(20);
    admin.setSalario(20000);
    admin.setTurno("Noturno");
    admin.setAdicionalNoturno(2500);
    admin.exibirDados();
    System.out.print("\n");

    // Criando assistente técnico
    AssistenteTecnico tecnico = new AssistenteTecnico();
    tecnico.setMatricula(8427679);
    tecnico.setNome("Gol D. Roger");
    tecnico.setIdade(17);
    tecnico.setSalario(17500);
    tecnico.setBonusSalario(4000);
    tecnico.exibirDados();
    System.out.print("\n");
  }
}
