package streams;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;


public class Filter {

	public static void main(String[] args) {
		
		
		Aluno a1 = new Aluno("Ana", 7.8,  9.0,"Silva",true);
		Aluno a2 = new Aluno("Bia", 5.9, 1.4, "Silva",true);
		Aluno a3 = new Aluno("Daniel", 9.8, 3.2, "Silva",true);
		Aluno a4 = new Aluno("Gui", 6.8, 8.6, "Silva",true);
		Aluno a5 = new Aluno("Rebeca", 7.1, 6.6, "Silva",true);
		Aluno a6 = new Aluno("Pedro", 8.8, 7.6, "Silva",true);
		
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		
		Predicate<Aluno> aprovadosMedia = 
				a -> a.nota1 + a.nota2 /2 >=7;
			
		Predicate<Aluno> aprovadoSegundaNota =
				a -> a.nota2 >= 4;
				
		Function<Aluno, String> mensagemAprovado = a -> "Parabéns " + a.nome + "! você foi aprovado(a)";		
		
		
		
		alunos.stream()
			//.filter(a -> a.nota >= 7) mesmo funcionamento porém não pode ser reutilizado pq n é função
			.filter(aprovadosMedia)
			.filter(aprovadoSegundaNota)
			.map(mensagemAprovado)
			//.map(a -> "Parabéns " + a.nome + "! você foi aprovado") mesmo funcionamento 
			
			.forEach(System.out::println);
		
	}
}
