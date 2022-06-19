package br.com.generation.collections;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
	
	List<Produtos> listaDeProdutos = new ArrayList();
	
	public void adicionarProduto(Produtos produto) {
		listaDeProdutos.add(produto);
		
	}
	
	public void exibirEstoque() {
		System.out.println(listaDeProdutos);
	}
	
	public void removerProduto(Produtos produto) {
		listaDeProdutos.remove(produto);
	}
	
	public void atualizarProduto(Produtos produtoAntigo, Produtos produtoNovo) {
		listaDeProdutos.remove(produtoAntigo);
		listaDeProdutos.add(produtoNovo);
	}

}
