package br.com.poo.exercicio4;

public class TestaFuncionario {
	
	public static void main(String[] args) {
		
		Funcionarioo func1 = new Funcionarioo();
		
		func1.setFuncaoFunc("desenvolvedor");
		func1.setNomeFunc("Annie");
		func1.setSalarioFunc(8000.00);
		
		System.out.println("O nome do funcionário é: " + func1.getNomeFunc());
		System.out.println("A função do funcionário é: " + func1.getFuncaoFunc());
		System.out.println("O salário do funcionário é: " + func1.getSalarioFunc());
		
		
		
	}

}
