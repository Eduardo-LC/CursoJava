package classe;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TesteClassTxt {
	
	public String caminhoEntrada = "C:/Teste01/teste01.txt";
    String caminhoSaida = "C:/Teste01/saida.txt";
	
	
	TesteClassTxt(){
		
	}
	
    public void imprimirLinhas(String caminhoEntrada , String caminhoSaida){
    try {
    	 
   
        Path pathEntrada = Paths.get(caminhoEntrada);
        Stream<String> linhas = Files.lines(pathEntrada);

       
        List<String> linhasProcessadas = linhas.map(line -> processarLinha(line)).collect(Collectors.toList());

        
        linhasProcessadas.forEach(System.out::println);

        
        Path pathSaida = Paths.get(caminhoSaida);
        Files.write(pathSaida, linhasProcessadas);

        linhas.close();
        
        
    } catch (IOException e) {
        System.out.println("Ocorreu um erro ao processar o arquivo: " + e.getMessage());
    }

}

	String processarLinha(String linha) {
		
        StringBuilder resultado = new StringBuilder();
        boolean encontrouMaiuscula = false;

        for (char c : linha.toCharArray()) {
            if (Character.isUpperCase(c)) {
                encontrouMaiuscula = true;
            }

            if (encontrouMaiuscula) {
                if (Character.isLetterOrDigit(c) || Character.isWhitespace(c)) {
                    resultado.append(c);
                }
            }    
        }

        return resultado.toString();
	}

}
