package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		// ( F -32 ) x 5/9 = C
		
		double F = 50;
		double C = 10;
		final double resultadoC = (F - 32) * 5/9;
		final double resultadoF = (C * 9/5) + 32;
		
		System.out.println(resultadoC);
		System.out.println(resultadoF);
		
		
		
	}

}
