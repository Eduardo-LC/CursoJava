package lambdas;

public class CalculoTeste2 {
	
	public static void main(String[] args) {
		
		Calculo calc = (x , y) -> {
			return x + y;
		};
		System.out.println(calc.executar(2, 3));
		
		calc = (x, y) -> x * y; //quando não tem {} automaticamente é 
								//escrito return msm q ele n apareça
								//desvantagem , não pode ter mais de uma centença de codigo
								
		System.out.println(calc.executar(2, 3));
		
		System.out.println(calc.legal());
		System.out.println(Calculo.muitoLegal());
	}

}
