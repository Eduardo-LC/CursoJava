package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		// informações do funcionário
		
		// Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 2_348_452_293L;
		
		
		// Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_348_452_29;
		
		// Tipo  booleano
		boolean estaDeFerias = false; // or true
		
		// Tipo caractere
		char status = 'A'; // ativo
		
		// Dias de empresa 
		System.out.println(anosDeEmpresa * 365);
		
		// Número de viagens
		System.out.println(numeroDeVoos /2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha > " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
	}

}
