package execao.personalizadaA;

import execao.Aluno;


public class TesteValidacoes {
	
	public static void main(String[] args) {
		
		
		try {
			Aluno aluno = new Aluno("eee", 9);
			//Validar.aluno(aluno);
			Validar.aluno(aluno);
			Validar.aluno(null);
			
		} catch (StringVaziaException e) {
			System.out.println(e.getMessage());
		} catch(NumeroForaIntervaloException
				| IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("FIM!!!");
	}

}
