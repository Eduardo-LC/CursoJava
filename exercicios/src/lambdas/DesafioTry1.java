package lambdas;


import java.util.function.Function;

import java.util.function.UnaryOperator;

public class DesafioTry1 {
	
	public static void main(String[] args) {
		
		
		
		Function<Produto, Double> precoFinal = 
				produto -> produto.preco * (1 - produto.desconto);
		
		UnaryOperator<Double> impostoMunicipal =
				preco -> preco >= 2500 ? preco * 1.085 : preco;
		
		UnaryOperator<Double> frete =
				preco -> preco >=3000 ? preco + 100 : preco + 50; 
		
				
				
		UnaryOperator<Double> arredondar = 
				//preco -> Double.parseDouble(String.format("%.2f" , preco));
				preco ->{
				double factor = Math.pow(10, 2);
				double adjustedValue = Math.round(preco * factor) / factor;
				return adjustedValue;
						};
		
		Function<Double, String> formatar = 
				preco -> ("R$" + preco).replace(".",",");
	
		
		Produto p = new Produto("iPad", 3500, 0.13);
		
		String preco = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(p);
		System.out.println("O preço final é " + preco);
		
		/*
		 * 1. Apartir do produto calcular o preco real (com desconto)
		 * 2. Imposto municipal : >= 2500 (8,5%) / 2500 (Isento)
		 * 3. Frete: >= 3000 (100) / < 3000 (50)
		 * 4. Arredondar: Deixar duas casas decimais
		 * 5. Formatar: R$1234,5
		 */
		
		
	}


}
