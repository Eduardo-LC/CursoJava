package execao.personalizadaA;

import execao.Aluno;

public class Validar {
	
	private Validar() {
		
	}
	
	public static void aluno(Aluno aluno){
		
		if(aluno == null) {
			throw new IllegalArgumentException("O aluno está nulo!");
		}
		if(aluno.nome == null || aluno.nome.trim().isEmpty()){
			throw new StringVaziaException("nome");
		}
		if(aluno.nota1 < 0 || aluno.nota1 > 10) {
			throw new NumeroForaIntervaloException("nota");
		}
			
	}

}
