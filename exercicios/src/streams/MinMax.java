package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class MinMax {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Zeca", 7.1);
		Aluno a2 = new Aluno("SeuCuca", 6.1);
		Aluno a3 = new Aluno("ZeQuinha", 6.1);
		Aluno a4 = new Aluno("Zeca", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Comparator<Aluno> melhorNota = (aluno1, aluno2) ->{
			if(aluno1.nota1 > aluno2.nota1) return 1;
			if(aluno1.nota1 < aluno2.nota1) return -1;
			return 0;	
		};
		
		Comparator<Aluno> piorNota = (aluno1, aluno2) ->{
			if(aluno1.nota1 > aluno2.nota1) return -1;
			if(aluno1.nota1 < aluno2.nota1) return 1;
			return 0;	
		};

		
		System.out.println(alunos.stream().max(melhorNota).get());
		System.out.println(alunos.stream().min(melhorNota).get());
		
		System.out.println(alunos.stream().max(piorNota).get());
		
		
	}
}
