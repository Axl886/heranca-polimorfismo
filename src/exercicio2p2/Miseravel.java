package exercicio2p2;

/**
 * Classe para armazenar valores e exibir uma mensagem.
 * 
 * Miseravel
 * 
 * @author Victor Gabriel Alves Pereira
 * @author Victor Matheus Carvalho Pinheiro
 */

public class Miseravel extends Pessoa {
	
/**
 * M�todo construtor
 * 
 * @param nome 
 * @param idade
 */
	
public Miseravel(String nome, int idade) {
	super(nome, idade);
	}
public String getNome() {
	return nome;
}


public void setNome(String nome) {
	this.nome = nome;
}


public int getIdade() {
	return idade;
}


public void setIdade(int idade) {
	this.idade = idade;
}

/**
 * M�todo para mostrar uma mensagem
 * 
 */

public void Mendiga() {
	System.out.println("|Voc� se encontra em uma situa��o vulner�vel e dif�cil.|");
	}
		
}
