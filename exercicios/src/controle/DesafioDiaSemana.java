package controle;

import java.util.Scanner;



public class DesafioDiaSemana {
	
	public static void main(String[] args) {
		
		// Domingo 1
		// segunga 2
		// terça 3
		// quarta 4
		// quinta 5
		// sexta 6
		// sabado 7
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o dia da semana: ");
		
		String diasemana = entrada.next();
		
	
		
		if("domingo".equalsIgnoreCase(diasemana)) {
			System.out.println(1);
		}
		else if ("segunda".equalsIgnoreCase(diasemana)) {
			System.out.println(2);
		}
		else if ("terça".equalsIgnoreCase(diasemana)) {
			System.out.println(3);
		}
		else if ("quarta".equalsIgnoreCase(diasemana)) {
			System.out.println(4);
		}
		else if ("quinta".equalsIgnoreCase(diasemana)) {
			System.out.println(5);
		}
		else if ("sexta".equalsIgnoreCase(diasemana)) {
			System.out.println(6);
		}
		else {
			System.out.println(7);
		}
		
		
		
		
		entrada.close();
		
			
	}
		
}

