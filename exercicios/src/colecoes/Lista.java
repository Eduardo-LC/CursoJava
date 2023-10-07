package colecoes;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("SeuCUCA"));
		lista.add(new Usuario("Pedreiro"));
		lista.add(new Usuario("Luquinha"));
		
		System.out.println(lista.get(3));
		
		System.out.println(lista.remove(1));
		System.out.println(lista.remove(new Usuario("Luquinha")));
		
		System.out.println(lista.contains(new Usuario("SeuCUCA")));
		
		for (Usuario u: lista) {
			System.out.println(u.nome);
		}
		
		
	}

}
