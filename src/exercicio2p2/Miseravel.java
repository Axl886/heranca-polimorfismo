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
	 * M�todo construtor referenciando as vari�veis da superclasse.
	 * 
	 * @param nome
	 * @param idade
	 */
	public Miseravel(String nome, int idade) {
		super(nome, idade);
	}

	/**
	 * M�todo para mostrar uma mensagem ao usu�rio.
	 */
	public void Mendiga() {
		System.out.println("|Voc� se encontra em uma situa��o vulner�vel e dif�cil.|");
	}
}
