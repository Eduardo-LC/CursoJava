package execao;



public class ChecadaVsNaoChecada {
	
	public static void main(String[] args) {
		
		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			geraErro2();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("FIM!!");
	}

	// não checada ou não verificada
	static void geraErro1() throws RuntimeException{
		throw new RuntimeException("Ocorreu um erro bem legal #01");
	}
	
	// checada ou verificada
	static void geraErro2() throws Exception{
		try {
			throw new Exception("Ocorreu um erro bem legal #02");
		} catch (Exception e) {
			System.out.println("que legal");
		}
	}
}
