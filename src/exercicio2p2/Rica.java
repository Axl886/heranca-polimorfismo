package exercicio2p2;

/**
 * Classe para exibir uma mensagem sobre uma pessoa rica.
 * 
 * Rica
 * 
 * @author Victor Gabriel Alves Pereira
 * @author Victor Matheus Carvalho Pinheiro
 */

public class Rica extends Pessoa {
	private double dinheiro = 500.000;
	
 /**
  * Método construtor.
  * 
  * @param nome 
  * @param idade
  */	
	
 public Rica(String nome, int idade) {
		super(nome, idade);
	}
 
 /**
  * Retorna o nome existente da atual pessoa rica
  * 
  * @return nome da pessoa rica
  */
 public String getNome() {
		return nome;
	}
 
 /**
  * Define um nome da pessoa rica
  * 
  * @param nome nome da pessoa rica
  */
 public void setNome(String nome) {
		this.nome = nome;
	}
	
  /**
   * Retorna a idade existente da pessoa rica 
   * 
   *  @return idade da pessoa rica
   */
 public int getIdade() {
		return idade;
	}
	/**
	   * Define a idade da pessoa rica
	   * 
	   * @param idade idade da pessoa rica
	   */ 
 public void setIdade(int idade) {
		this.idade = idade;
	}
 
 /**
  * Exibe uma mensagem
  * 
  */
 public void fazCompras() {
		System.out.println("|Você tem uma ótima renda mensal.|");
		}
   
 /**
  * Retorna o dinheiro do usuário
  * 
  * @return dinheiro
  */
 public double getDinheiro() {
		return dinheiro;
	}

 /**
  * Define uma valor para o dinheiro do usuário
  * 
  * @param dinheiro
  */
 public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}
		
 }

