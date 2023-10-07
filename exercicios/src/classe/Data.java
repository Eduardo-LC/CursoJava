package classe;

public class Data {
	
	double mes;
	double dia;
	double ano;
	
	Data (){
		mes = 1;
		dia = 1;
		ano = 1970;
	}
	
	Data (double dia, double mes, double ano){
		this.mes = mes;
		this.dia = dia;
		this.ano = ano;	 
	}

	
	String obterDataFormatada() {
		final String formato = " %.0f/%.0f/%.0f ";
		return String.format(formato, this.dia , mes , ano);
	}
	
	
}
