package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMapTry1 {
	
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		Function<Integer, String> converterBi = n -> Integer.toBinaryString(n);
		
		Function<String, Integer> inverterNum = n -> {
		    String reversed = new StringBuilder(n).reverse().toString();
		    return Integer.parseInt(reversed, 2); // Converte a string binária invertida para decimal
		};
	
        UnaryOperator<Integer> converterBiInt = n -> {
            int numeroDecimal = 0;
            String binario = new StringBuilder(Integer.toBinaryString(n)).reverse().toString();

            int tamanho = binario.length();

            for (int i = 0; i < tamanho; i++) {
                char digito = binario.charAt(tamanho - 1 - i);
                if (digito == '1') {
                    numeroDecimal += Math.pow(2, i);
                } else if (digito != '0') {
                    // Se o dígito não for 0 nem 1, a entrada não é um número binário válido.
                    throw new IllegalArgumentException("A entrada não é um número binário válido.");
                }
            }

            return numeroDecimal;
        };

        nums.stream()
        	.map(converterBi)
        	.map(inverterNum)
        	.map(converterBiInt)
        	.forEach(System.out::println);
           
		//Integer.toBinaryString(n);
		
		/*
		 * 1 Numero para String binária... 6 => "110"
		 * 2 inverter a sting ... "110 => "001"
		 * 3 Converter de volta para inteiro => "011" => 3
		 */
	}		

}


