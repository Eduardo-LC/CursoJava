package arrays;

import java.util.Scanner;

public class DesafioMedia {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Favor digite a quantidade de notas a serem digitadas: ");
		int qNotas = entrada.nextInt();
		
		double[] notas = new double[qNotas];
		
		for (int i = 0; i < qNotas; i++) {
			System.out.print("Digite a nota do " + (i+1) + " aluno: ");
			notas[i] = entrada.nextInt();
			
		}
		double soma = 0;
		
		for(double nota: notas) {
			soma += nota;
		}
		
		double media = soma / qNotas;
		System.out.println("a média das notas dos alunos é " + media);
		
		entrada.close();
	}
	
}
