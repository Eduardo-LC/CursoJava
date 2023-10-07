package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
	
		Produto p1 = new Produto("Notebook", 4356.89);
		//p1.nome = "Notebook";
		//p1.preco = 4356.89;
		//p1.desconto = 0.25;
		
		
		Produto p2 = new Produto();
		p2.nome = "Caneta Azul";
		p2.preco = 12.56;
		
		Produto.desconto = 0.25;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		System.out.println(p2.preco);
		System.out.println(p1.seForNatal(0.50));

		
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		double mediaCarrinho = (precoFinal1 + precoFinal2) /2;
		
		
		System.out.printf("Média do carrinho = R$%.2f" , mediaCarrinho);
	
		
	}
}
