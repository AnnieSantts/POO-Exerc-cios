package br.com.generation.collections;

public class CollectionExercicio {

	public static void main(String[] args) {
		/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
		trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
		programa deverá atender as seguintes funcionalidades:
		Armazenar dados da List
		Remover dados da list;
		Atualizar dados da list.
		Apresentar todos os dados da list. */
		
		Estoque estoq1 = new Estoque();
		Produtos prod1 = new Produtos("sabão", 40.00);
		Produtos prod2 = new Produtos("Amora", 2.50);
		
		estoq1.adicionarProduto(prod1);
		estoq1.adicionarProduto(prod2);
		estoq1.exibirEstoque();
		estoq1.removerProduto(prod1);
		estoq1.exibirEstoque();
		
		Produtos prod3 = new Produtos("Amora", 2000.00);
		
		estoq1.atualizarProduto(prod2, prod3);
		estoq1.exibirEstoque();

	}

}
