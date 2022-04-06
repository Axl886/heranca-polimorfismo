package exercicio2;

/**
 * Classe abstrata para registro de informaçõe sobre animais.
 * 
 * Animal
 * 
 * @author Victor Gabriel Alves Pereira
 * @author Victor Matheus Carvalho Pinheiro
 */

public abstract class Animal {
		String nome;
		String raca;
		
 public Animal(String nome,String raca) {
			this.raca = raca;
			this.nome = nome;
		}
 
 /**
  * Exibe como o animal fala
  */
 
 public  void falar() {
	 
 /**
  * Retorna o nome existente de animal
  * 
  * @return nome do funcionário
  */		 		
	}
 
 public String getNome() {
			return nome;
	}
 
 /**
  * Define um valor para nome 
  * 
  * @param nome nome a ser definido.
  */
 
 public void setNome(String nome) {
			this.nome = nome;
		}
 
 /**
  * Retorna a raca existente do animal
  * 
  * @return raca do animal
  */	
 
 public String getRaca() {
			return raca;
		}
 
 /**
  * Define um valor para raca
  * 
  * @param raca raca a ser definida.
  */
 
 public void setRaca(String raca) {
			this.raca = raca;
		}
 
 /**
  * Exibe como o animal caminha
  */
 
 public void caminhar(){
		System.out.println("Caminha em quatro patas");

		
	}
 }
	