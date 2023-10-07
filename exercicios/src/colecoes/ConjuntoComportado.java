package colecoes;

import java.util.HashSet;
import java.util.Set;
// import java.util.HashSet;
// import java.util.Iterator;
// import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main(String[] args) {
		
		SortedSet<String> listaAprovados = new TreeSet<>();
		
		
		listaAprovados.add("SeuCuca");
		listaAprovados.add("SuCulo");
		listaAprovados.add("Luca");
		listaAprovados.add("Santiago");
		
		for (String candidato: listaAprovados) {
			System.out.println(candidato);
			
		}
		
		Set<Integer> nums = new HashSet<>();
		
		nums.add(3);
		nums.add(4);
		nums.add(6);
		nums.add(7);
		
		for (int n: nums) {
			System.out.println(n);
		}
		
	}

}
