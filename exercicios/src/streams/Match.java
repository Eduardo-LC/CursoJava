package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Zeca", 7.1);
		Aluno a2 = new Aluno("Zeca", 7.1);
		Aluno a3 = new Aluno("Zeca", 8.1);
		Aluno a4 = new Aluno("Zeca", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> aprovado = a -> a.nota1 >= 7;
		Predicate<Aluno> reprovado = aprovado.negate();
		
		System.out.println(alunos.stream().allMatch(aprovado));//todos foram aprovados?
		System.out.println(alunos.stream().anyMatch(aprovado));//alguem foi aprovado?
		System.out.println(alunos.stream().noneMatch(reprovado));//nenhum foi aprovado?
		//pode usar negate para inverter o resultado
	}

}
