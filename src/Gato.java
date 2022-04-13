package exercicio2;

import java.util.Scanner;

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


 public String inserirGato() throws Exception {
	 String gato;
	 
	 Scanner ler = new Scanner(System.in);
	 
	 System.out.println("Seu animal preferido é gato mesmo? Digite |Cat|, se for o caso.");
	 	gato = ler.next();
	 
	 if(gato.equals("Cat")){
		System.out.println("Qual o nome do seu gatinho?");
	 		setNome(ler.next());
	 	System.out.println("Qual a raça do bichano?");
	 		setRaca(ler.next());
	 	System.out.println(getNome()+" é da raça "+getRaca());
	 	falar();
	 	caminhar();
	 } else {
		 Exception e = new Exception("Não encontrado :/, tente novamente.");
		 throw e;
	 }
	 return gato;
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


