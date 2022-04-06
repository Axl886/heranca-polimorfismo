package exercicio2;

/**
 * Classe para dizer o nome, ra�a, como fala e caminha o animal cachorro.
 * 
 * Cachorro
 * 
 * @author Victor Gabriel Alves Pereira
 * @author Victor Matheus Carvalho Pinheiro
 */

public class Cachorro extends Animal {
	
 /**
  * M�todo construtor
  * 
  * @param nome 
  * @param raca
  */
	
 public Cachorro(String nome, String raca) {
		super(nome, raca);
	}
 
 /**
  * Retorna a ra�a existente do animal cachorro
  * 
  * @return raca
  */
 public String getRaca() {
		return raca;
	}
 
 /**
  * Define uma ra�a no atual animal cachorro
  * 
  * @param ra�a ra�a a ser definida
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
		System.out.println("Mesmo pregui�oso, o animal est� caminhando");
	}
   
  }
