package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	

	List<oo.composicao.desafio.Item> itens = new ArrayList<>();
	
	void adicionarItem( int quantidade, Produto p) {
		this.itens.add(new Item(quantidade, p));
	}
	
	void adicionarItem(double preco, String nome, int qtde) {
		this.itens.add(new Item (qtde , (new Produto(preco, nome))));
	}
	public double obterValorTotal() {
		double total = 0;
		
		for(oo.composicao.desafio.Item item: itens) {
			total += item.quantidade * item.produto.preco;
		}
		
		return total;
	
	}

}
