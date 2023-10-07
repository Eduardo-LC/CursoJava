package classe;

public class Jantar {
	
	public static void main(String[] args) {
		
		Comida c1 = new Comida("Bife", 0.450);
		Pessoa p1 = new Pessoa("Arnaldo",82.0);
		
		Comida c2 = new Comida("Bife acebolado",4);
		Pessoa p2 = new Pessoa("Rivaldo",240.0);
		
	   
		p1.comer(c2);
		p2.comer(c1);
		
		System.out.println(p1.apresentar());
		System.out.println(p2.apresentar());
		
		
	}

}
