package fundamentos.operadores;

public class DesafioLogicos {
	// Trabalho na terça (V OR F)
	// Trabalho na quinta (V OR F)
	public static void main(String[] args) {
		

	
	boolean trabalho1 = true;
	boolean trabalho2 = false;
	
	boolean televisao50 = trabalho1 && trabalho2;
	boolean televisao32 = trabalho1 ^ trabalho2;
	boolean comprouSorvete = trabalho1 || trabalho2;//operador unário 
	
	
	System.out.println("Comprou tv50 ? " + televisao50);
	System.out.println("Comprou tv32 ? " + televisao32);
	System.out.println("Nao comprou sorvete ? " + comprouSorvete);
	
	}

}
