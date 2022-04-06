package exercicio2;

/**
 * Classe que guarda os valores de nome, ra�a e mostra como fala e caminha o animal gato.
 * 
 * Gato
 * 
 * @author Victor Gabriel Alves Pereira
 * @author Victor Matheus Carvalho Pinheiro
 */

public class Gato extends Animal{
	 


/**
  * M�todo construtor 
  * 
  * @param nome
  * @param raca
  */
	
 public Gato(String nome, String raca) {
		super(nome, raca);
		}

 /**
  * Retorna a ra�a existente do animal gato
  * 
  * @return ra�a
  */
 
 public String getRaca() {
		return raca;
	}
 
 /**
  * Define uma ra�a no atual animal gato
  * 
  * @param ra�a ra�a a ser definida
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
  * Exibe uma mensagem ao usu�rio
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
		System.out.println("Mesmo pregui�oso, o animal est� caminhando");
	}
	
}


