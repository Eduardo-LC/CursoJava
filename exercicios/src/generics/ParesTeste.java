package generics;

public class ParesTeste {
	
	public static void main(String[] args) {
		
		Pares<Integer, String> resultadoConcurso = new Pares<>();
		
		resultadoConcurso.adicionar(1, "Mariaaa");
		resultadoConcurso.adicionar(2, "Pedro");
		resultadoConcurso.adicionar(2, "Guii");
		resultadoConcurso.adicionar(5, "ANA");
		resultadoConcurso.adicionar(5, "SeuCreyson");
		
		
		System.out.println(resultadoConcurso.getValor(1));
		System.out.println(resultadoConcurso.getValor(2));
		System.out.println(resultadoConcurso.getValor(5));
	}

}
