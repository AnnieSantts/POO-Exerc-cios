package br.com.heranca.exercicio1;

public class TestaAnimais {

	public static void main(String[] args) {
		
		Cachorro dog1 = new Cachorro();
		dog1.nome = "Vini";
		dog1.idade = 25;
		dog1.emitirSom();
		dog1.correr();
		
		Cavalo pocoto = new Cavalo();
		pocoto.nome = "Pocoto";
		pocoto.idade = 10;
		pocoto.correr();
		pocoto.emitirSom();
		
		BichoPreguica lazy = new BichoPreguica();
		lazy.nome = "Lazy";
		lazy.idade= 25;
		lazy.emitirSom();
		lazy.escalar();
		

	}

}
