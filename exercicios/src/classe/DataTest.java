package classe;

public class DataTest {
	
	public static void main(String[] args) {
		
		Data d1 = new Data(15,02,2012);
		Data d2 = new Data();
		
		//d1.ano = 2012;
		//d1.dia = 15;
		//d1.mes = 02;
	
		System.out.printf(d1.obterDataFormatada());
		System.out.printf(d2.obterDataFormatada());
	}

}
