package exercicio2;

/**
 * Classe que guarda os valores de nome, raça e mostra como fala e caminha o animal gato.
 * 
 * Gato
 * 
 * @author Victor Gabriel Alves Pereira
 * @author Victor Matheus Carvalho Pinheiro
 */

public class Gato extends Animal{
	 


/**
  * Método construtor 
  * 
  * @param nome
  * @param raca
  */
	
 public Gato(String nome, String raca) {
		super(nome, raca);
		}

 /**
  * Retorna a raça existente do animal gato
  * 
  * @return raça
  */
 
 public String getRaca() {
		return raca;
	}
 
 /**
  * Define uma raça no atual animal gato
  * 
  * @param raça raça a ser definida
  */
 
 public void setRaca(String raca) {
		this.raca = raca;
	}
 
 /**
  * Retorna o nome existente do animal gato
  * 
  * @return nome
  */
 
 public String getNome() {
			return nome;
	}
 
 /**
  * Define um nome no atual animal gato
  * 
  * @param nome nome a ser definido
  */

 public void setNome(String nome) {
		this.nome = nome;
		
	}
 
 /**
  * Exibe uma mensagem ao usuário
  * 
  * falar
  */
  @Override
  public void falar() {
		System.out.println("Miau,miauu");
	}
  
  /**
   * Exibe uma mensagem de como o animal caminha
   * 
   * caminhar
   */
   @Override
 public void caminhar() {
		System.out.println("Mesmo preguiçoso, o animal está caminhando");
	}
	
}


