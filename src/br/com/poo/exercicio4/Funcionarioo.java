package br.com.poo.exercicio4;

public class Funcionarioo {
	
private String nomeFunc;
private String funcaoFunc;
private double salarioFunc;


public String getNomeFunc() {
	return nomeFunc;
}
public void setNomeFunc(String nomeFunc) {
	this.nomeFunc = nomeFunc;
}
public String getFuncaoFunc() {
	return funcaoFunc;
}
public void setFuncaoFunc(String funcaoFunc) {
	this.funcaoFunc = funcaoFunc;
}
public double getSalarioFunc() {
	return salarioFunc;
}
public void setSalarioFunc(double salarioFunc) {
	this.salarioFunc = salarioFunc;
}

public void funcDeFolga (boolean funcDeFolga){
	if(funcDeFolga == true) {
		System.out.println("O funcionário está de folga");
	}
}

}
