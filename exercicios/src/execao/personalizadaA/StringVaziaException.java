package execao.personalizadaA;

@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException {
	
	public String nomeDoAtributo;
	
	public StringVaziaException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}

	
	public String getMessage() {
		return String.format("o atributoi %s está vazio.",
				nomeDoAtributo);
	}
}
