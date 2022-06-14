package br.com.poo.exercicio1;

import java.util.Scanner;

public class CriaCliente {

	public static void main(String[] args) {
		/*Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console. */
		
		Scanner leia = new Scanner(System.in);
		
		Cliente primeiroCliente = new Cliente();
		
		primeiroCliente.setNome("João");
		primeiroCliente.setSexo("masculino");
		primeiroCliente.setIdade(24);
		
		System.out.println(primeiroCliente.getNome());
		System.out.println(primeiroCliente.getSexo());
		System.out.println(primeiroCliente.getIdade());
		
		System.out.println("O cliente fechou o contrato?");
		primeiroCliente.fecharContrato(true);

	}

}
