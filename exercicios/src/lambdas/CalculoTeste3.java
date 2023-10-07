package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	
	public static void main(String[] args) {
		
		BinaryOperator<Double> calc = (x , y) -> {
			return x + y;
		};
		//NÃO : int -> Double
		// double -> Double
		
		System.out.println(calc.apply(2.0 ,3.0));
		
		calc = (x, y) -> x * y; //quando não tem {} automaticamente é 
								//escrito return msm q ele n apareça
								//desvantagem , não pode ter mais de uma centença de codigo
								
		System.out.println(calc.apply(2.0, 3.0));
		
		
	}

}
