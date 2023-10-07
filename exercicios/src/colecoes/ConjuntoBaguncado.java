package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("SeuCuca");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("Tamanho é" + conjunto.size());
		
		conjunto.add("teste");
		
		System.out.println("Tamanho é" + conjunto.size());
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println("Tamanho é" + conjunto.size());
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains("SeuCULO"));
		System.out.println(conjunto.contains(false));
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		conjunto.addAll(nums);
		
		System.out.println(conjunto);
		
		conjunto.clear();
		
		System.out.println(conjunto);
	}

}
