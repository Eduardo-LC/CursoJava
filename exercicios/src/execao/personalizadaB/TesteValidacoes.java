package execao.personalizadaB;

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
		
		//Validar.aluno(aluno); agora precisa de try catch com exceção checada ou throws ..nome métodos depois do main 
		
		System.out.println("FIM!!!");
	}

}
