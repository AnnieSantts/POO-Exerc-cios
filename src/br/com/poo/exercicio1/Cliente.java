package br.com.poo.exercicio1;

public class Cliente {

	private String nome;
	private String sexo;
	private int idade;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	void fecharContrato (boolean aprovado){
		if(aprovado == true) {
			System.out.println("Contrato fechado!");
		}else
		{
			System.out.println("O orçamento não foi aprovado");
		}
	}
}

