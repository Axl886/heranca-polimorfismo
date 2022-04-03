package exercicio1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Classe para interação com os gerentes e assistentes
 * 
 * Main
 * 
 * @author Victor Gabriel Alves Pereira
 * @author Victor Matheus Carvalho Pinheiro
 */
public class Main {
  /**
   * Interação usuário=terminal com o exercício
   */
  public static void main() {
    Scanner scanner = new Scanner(System.in);
    List<Gerente> gerentes = new LinkedList<Gerente>();
    List<AssistenteTecnico> tecnicos = new LinkedList<AssistenteTecnico>();
    List<AssistenteAdministrativo> administradores = new LinkedList<AssistenteAdministrativo>();
    String nome = null;

    while (true) {
      System.out.println("Selecione as opções:");
      System.out.println("1 - Adicionar gerente:");
      System.out.println("2 - Exibir dados de um gerente:");
      System.out.println("3 - Adicionar assistente técnico:");
      System.out.println("4 - Exibir dados de um assistente técnico:");
      System.out.println("5 - Adicionar assistente administrativo:");
      System.out.println("4 - Exibir dados de um assistente administrativo:");
      int option = scanner.nextInt();

      switch (option) {
        case 1:
          Gerente gerente = new Gerente();
          System.out.println("Adicionar gerente:");
          System.out.println("Nome:");
          scanner.nextLine();
          gerente.setNome(scanner.nextLine());
          System.out.println("Idade:");
          gerente.setIdade(scanner.nextInt());
          System.out.println("Salário:");
          gerente.setSalario(scanner.nextFloat());

          gerentes.add(gerente);
          break;

        case 2:
          System.out.println("Digite o nome do gerente:");
          scanner.nextLine();
          nome = scanner.nextLine();

          for (Gerente tmpGerente : gerentes) {
            if (tmpGerente.getNome().equals(nome)) {
              tmpGerente.exibirDados();
              break;
            }
          }
          break;

        case 3:
          AssistenteTecnico tecnico = new AssistenteTecnico();
          System.out.println("Adicionar assistente técnico:");
          System.out.println("Nome:");
          tecnico.setNome(scanner.nextLine());
          System.out.println("Matrícula:");
          tecnico.setMatricula(scanner.nextLong());
          System.out.println("Idade:");
          tecnico.setIdade(scanner.nextInt());
          System.out.println("Salário:");
          tecnico.setSalario(scanner.nextFloat());
          System.out.println("Bônus para salário:");
          tecnico.setBonusSalario(scanner.nextFloat());

          tecnicos.add(tecnico);
          break;

        case 4:
          System.out.println("Digite o nome do assistente técnico:");
          nome = scanner.nextLine();

          for (AssistenteTecnico tmpTecnico : tecnicos) {
            if (tmpTecnico.getNome().equals(nome)) {
              tmpTecnico.exibirDados();
              break;
            }
          }
          break;

        case 5:
          AssistenteAdministrativo admin = new AssistenteAdministrativo();
          System.out.println("Adicionar assistente administrativo:");
          System.out.println("Nome:");
          admin.setNome(scanner.nextLine());
          System.out.println("Matrícula:");
          admin.setMatricula(scanner.nextLong());
          System.out.println("Idade:");
          admin.setIdade(scanner.nextInt());
          System.out.println("Salário:");
          admin.setSalario(scanner.nextFloat());
          System.out.println("Turno:");
          admin.setTurno(scanner.nextLine());
          System.out.println("Adicional noturno:");
          admin.setAdicionalNoturno(scanner.nextFloat());
          administradores.add(admin);
          break;

        case 6:
          System.out.println("Digite o nome do assistente administrativo:");
          nome = scanner.nextLine();

          for (AssistenteAdministrativo tmpAdministrativo : administradores) {
            if (tmpAdministrativo.getNome().equals(nome)) {
              tmpAdministrativo.exibirDados();
              break;
            }
          }
          break;

        case 7:
          System.out.println("Tenha um bom dia");
          scanner.close();
          System.exit(0);
          break;

        default:
          System.out.println("Opção não reconhecida");
          break;
      }
    }
  }
}
