package exercicio2p2;

public class Rica extends Pessoa {
	private double dinheiro = 500.000;
	
    public Rica(String nome, int idade) {
		super(nome, idade);
	}

	public void fazCompras() {
		System.out.println("|Você tem uma ótima renda mensal.|");
			
		}

	public double getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}
		
	}

