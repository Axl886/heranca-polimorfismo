package exercicio2;

/**
 * Classe para dizer o nome, raça, como fala e caminha o animal cachorro.
 * 
 * Cachorro
 * 
 * @author Victor Gabriel Alves Pereira
 * @author Victor Matheus Carvalho Pinheiro
 */

public class Cachorro extends Animal {
	
 /**
  * Método construtor
  * 
  * @param nome 
  * @param raca
  */
	
 public Cachorro(String nome, String raca) {
		super(nome, raca);
	}
 
 /**
  * Retorna a raça existente do animal cachorro
  * 
  * @return raca
  */
 public String getRaca() {
		return raca;
	}
 
 /**
  * Define uma raça no atual animal cachorro
  * 
  * @param raça raça a ser definida
  */
 
public void setRaca(String raca) {
		this.raca = raca;
	}
 
 /**
  * Retorna o nome existente do animal cachorro
  * 
  * @return nome
  */
 public String getNome() {
		return nome;
}
 /**
  * Define um nome no atual animal gato
  * 
  * @param nome nome a ser definida
  */
 public void setNome(String nome) {
		this.nome = nome;
	}

 /**
  * Exibe o que o animal fala
  */
  @Override
  public void falar() {
		System.out.println("Au, auuu");
		}
  /**
   * Exibe como o animal caminha
   */
  @Override
  public void caminhar() {
		System.out.println("Mesmo preguiçoso, o animal está caminhando");
	}
   
  }
