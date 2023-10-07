package lambdas;

public class Produto {
	
	final String nome;
	double preco;
	final double desconto;
	
	public Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	public String toString() {
		double precoFinal = preco * (1 - desconto);
		return String.format("Formatar: R$%.1f", precoFinal);
		
		//Formatar: R$1234,56
	}

}
