package exercicio2;

public abstract class Animal {
		String nome;
		String raca;
		
		public Animal(String nome,String raca) {
			this.raca = raca;
			this.nome = nome;
		}
		public abstract void falar(); 
		
	}
	