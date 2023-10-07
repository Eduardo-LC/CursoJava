package fundamentos;

import java.util.Scanner;


public class DesafioConversão {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		

		System.out.print("Digite o salário do primeiro mês: ");
		String salario1 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite o salário do segundo mês: ");
		String salario2 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite o salário do terçeiro mês: ");
		String salario3 = entrada.nextLine().replace(",", ".");
		
		double sal1 = Double.parseDouble(salario1);
		double sal2 = Double.parseDouble(salario2);
		double sal3 = Double.parseDouble(salario3);
		
		double media = (sal1 + sal2 +sal3) / 3;
		
		System.out.println("O salário médio é: " + media);
		
		entrada.close();
		
	}

}
