package lambdas;

@FunctionalInterface
public interface Calculo {
	
	double executar(double a, double b);
	//@FunctionalInterface só permite um método abstract em interfaces 
	//é ultilizado para não gerar erros ao fazer lambdas 
	//porém podem ser criados métodos default ou static
	
	default String legal() {
		return "legal";
	}
	
	static String muitoLegal() {
		return "muito legal";
	}

}
