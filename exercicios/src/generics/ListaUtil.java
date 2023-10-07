package generics;

import java.util.List;

import javax.print.attribute.IntegerSyntax;

public class ListaUtil {
	
	public static Object getUltimo1(List<?> lista) {
		return lista.get(lista.size() - 1 );
	}
	
	public static <T> T getUltimo2(List<T> lista) {
		return lista.get(lista.size() - 1 );
	}
	
	
	//exemplo vários parametros genéricos
	public <A extends Number, B extends IntegerSyntax, C> C teste(A paramA, B paramB) {
		C teste = null;
		return teste;
	}

}
