package br.com.generation.collections;

public class Produtos {

	private String nome;
	private double preco;
	
	@Override
	public String toString() {
		return " [nome=" + nome + ", preco=" + preco + "]";
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public Produtos(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
}

