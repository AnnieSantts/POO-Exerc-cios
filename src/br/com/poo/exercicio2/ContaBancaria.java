package br.com.poo.exercicio2;

import java.util.Scanner;

public class ContaBancaria {

	public static void main(String[] args) {
		/*6) Crie uma classe conta bancaria e apresente os atributos e métodos
	referentes esta classe, em seguida crie um objeto conta bancaria, defina
	as instancias deste objeto e apresente as informações deste objeto no
	console. */
		double saque = 0;
		double deposito;
		Contas contaCliente1 = new Contas();
		contaCliente1.setNomeCliente("Maria");
		contaCliente1.setAgencia(124);
		contaCliente1.setConta(334);
		contaCliente1.setSaldo(1000.00);
		
		contaCliente1.getNomeCliente();
		contaCliente1.getAgencia();
		contaCliente1.getConta();
		contaCliente1.getSaldo();
		
		System.out.println("O nome do cliente é: " + contaCliente1.nomeCliente);
		System.out.println("Nº da agencia " + contaCliente1.agencia);
		System.out.println("Nº da conta " +contaCliente1.conta);
		System.out.println("O saldo da conta é: " + contaCliente1.saldo);
		
		//Depositando e sacando valores
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe o valor para saque");
		saque = leia.nextDouble();
		contaCliente1.saca(saque);
		System.out.println("O saldo em conta após o saque é de : " + contaCliente1.saldo);
		
		System.out.println("Informe o valor para depósito");
		deposito = leia.nextDouble();
		contaCliente1.deposita(deposito);
		System.out.println("O saldo em conta após o deposito é de : " + contaCliente1.saldo);
		
	
	

	}

}
