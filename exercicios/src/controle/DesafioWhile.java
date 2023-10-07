package controle;

import java.util.Scanner;



public class DesafioWhile {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int contAlunos = 0;
		int total = 0;
		String texto = "";
		int media = 0;
	
		
		while(!texto.equalsIgnoreCase("nao")) {
			System.out.print("Digite a nota do aluno: ");
			double nota = entrada.nextDouble();
			
			if(nota >= 0 && nota <= 10  ) {
			total += nota;
			contAlunos++;
			media = total / contAlunos;
			
			System.out.print("deseja continuar? ");
			System.gc();
			
			texto = entrada.nextLine();
			texto = entrada.nextLine();
			
			}
			else {
				System.out.println("Número inválido");
			}
		}
		
		
		System.out.println("a média é " + media);
		entrada.close();
	}

}
