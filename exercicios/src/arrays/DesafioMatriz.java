package arrays;

import java.util.Scanner;

public class DesafioMatriz {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
			
		System.out.print("Favor digite a quantidade de alunos a serem digitadas: ");
		int qAlunos = entrada.nextInt();
		System.out.print("Digite a Quantidade de notas do aluno: " );	
		int qNotas = entrada.nextInt();
		
		double soma = 0;
		
		double[][] notas = new double[qAlunos][qNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Notas aluno " + (i+1) + ": ");
			for(int j = 0; j < notas[i].length; j++) {
			System.out.print("Digite a nota: ");
			notas[i][j] = entrada.nextDouble();
			soma += notas[i][j]; 
			}	
		}
		
		double media = soma /(qAlunos * qNotas);
		System.out.println("a média das notas dos alunos é " + media);
			
		entrada.close();
	}

}
