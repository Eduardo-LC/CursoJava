package execao.personalizadaB;

@SuppressWarnings("serial")
public class StringVaziaException extends Exception {
	
	public String nomeDoAtributo;
	
	public StringVaziaException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}

	
	public String getMessage() {
		return String.format("o atributoi %s está vazio.",
				nomeDoAtributo);
	}
}
