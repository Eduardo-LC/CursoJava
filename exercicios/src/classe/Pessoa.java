package classe;

public class Pessoa {
	
	String nome;
	double peso;
	
	Pessoa (){
		
	}
	
	Pessoa (String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer (Comida comida) {
		
		this.peso += comida.pesoComida;
	
	}
	
	String apresentar () {
		
		return "Olá eu sou" + nome + "e tenho " + peso + "KG";
	}

}
