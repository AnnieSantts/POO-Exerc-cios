package br.com.poo.exercicio2;

public class Contas {
	
	int agencia;
	int conta;
	String nomeCliente;
	double saldo;
	
	
	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
		
	void deposita(double valor){
		saldo += valor;
	}
	
	void saca(double valor) {
		if(valor <= saldo) {
			saldo -= valor;
		}else {
			System.out.println("Saldo insuficiente");
		}
	}
}
