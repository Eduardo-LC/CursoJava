package execao.personalizadaB;

@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends Exception {
	
	public String nomeDoAtributo;
	
	public NumeroForaIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}

	
	public String getMessage() {
		return String.format("o atributoi %s está fora do intervalo",
				nomeDoAtributo);
	}
}
