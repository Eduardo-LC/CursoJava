package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Offer e Add -> adicionam elementos na fila 
		// Se a fila estiver cheio:
		fila.add("Ana"); // gera erro 
		fila.offer("Bia"); //Só retorna falso se der algum erro
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		//peek e element -> Obtem o proximo elemento da fila sem remover
		// se a fila estiver vazia : 
		System.out.println(fila.peek()); // se não tiver elemento gera NULL
		System.out.println(fila.peek());
		System.out.println(fila.element());// msm coisa só que gera ERRO
		System.out.println(fila.element());
		
		// fila.size();
		// fila.clear();
		// fila.isEmpty();
		// fila.contains(...);
		
		//poll e remove -> obtem o proximo elemento da fila e remove 
		
		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.remove()); // Gera ERRO
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
	}

}
