package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto;
	
	Produto (){
		desconto = preco * 0.25;
	}
	Produto (String nomeInicial, double precoInicial){
		
		nome = nomeInicial;
		preco = precoInicial;
		
	}
	
	Produto (String nomeInicial, double precoInicial, double descontoInicial){
		
		desconto = descontoInicial;
		nome = nomeInicial;
		preco = precoInicial;
		
	}
	
	double precoComDesconto () {
		
		double precoCD = preco * (1 - desconto);

		return precoCD;
	}
	
	double seForNatal(double descontoNatal) {
		
		double precoDN = preco * (1 - descontoNatal);
		
		return precoDN;
		
	}

}
