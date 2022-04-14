package exercicio2;

import java.util.Scanner;

/**
 * Classe que guarda os valores de nome, ra�a e mostra como fala e caminha o
 * animal gato.
 * 
 * Gato
 * 
 * @author Victor Gabriel Alves Pereira
 * @author Victor Matheus Carvalho Pinheiro
 */
public class Gato extends Animal {
	/**
	 * M�todo construtor da classe Gato referenciando os atributos da superclasse.
	 * 
	 * @param nome
	 * @param raca
	 */
	public Gato(String nome, String raca) {
		super(nome, raca);
	}

	/**
	 * M�todo que permite inserir o nome, ra�a do animal Gato
	 * e mostra como ele caminha e fala.
	 * 
	 */
	public String inserirGato() throws Exception {
		String gato;

		Scanner ler = new Scanner(System.in);

		System.out.println("Seu animal preferido � gato mesmo? Digite |Cat|, se for o caso.");
		gato = ler.next();

		if (gato.equals("Cat")) {
			System.out.println("Qual o nome do seu gatinho?");
			setNome(ler.next());
			System.out.println("Qual a ra�a do bichano?");
			setRaca(ler.next());
			System.out.println(getNome() + " � da ra�a " + getRaca());
			falar();
			caminhar();
		} else {
			Exception e = new Exception("N�o encontrado :/, tente novamente.");
			throw e;
		}
		return gato;
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
