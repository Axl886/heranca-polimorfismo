package exercicio2;

import java.util.Scanner;

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
 
 public String inserirCachorro() throws Exception {
	 String cachorro;
	 Scanner ler = new Scanner(System.in);
	 
	 System.out.println("Seu animal preferido � Cachorro mesmo? se sim, digite |Dog|");
	 	cachorro = ler.next();
	 	
	 if(cachorro.equals("Cachorro")) {	
		 System.out.println("Qual o nome do cachorrinho?");
		 	setNome(ler.next());
		 System.out.println("Qual a ra�a do seu dog?");
		 	setRaca(ler.next());
		 System.out.println("\n");
		 System.out.println(getNome()+" � da ra�a "+getRaca());
		 falar();
		 caminhar();
	 }else {
		 Exception e = new Exception("N�o encontrado :/, tente novamente.");
		 throw e;
	 }
	 return cachorro;
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
