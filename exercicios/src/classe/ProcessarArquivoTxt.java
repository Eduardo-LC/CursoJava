package classe;

public class ProcessarArquivoTxt {
    public static void main(String[] args) {
    	
    
    	TesteClassTxt c  = new TesteClassTxt();
    	c.imprimirLinhas(c.caminhoEntrada, c.caminhoSaida);
    	c.processarLinha(c.caminhoSaida);
    	
 	
//        String caminhoEntrada = "C:/Teste01/teste01.txt";
//        String caminhoSaida = "C:/Teste01/saida.txt";
//
//        try {
//            
//            Path pathEntrada = Paths.get(caminhoEntrada);
//            Stream<String> linhas = Files.lines(pathEntrada);
//
//           
//            List<String> linhasProcessadas = linhas.map(line -> processarLinha(line)).collect(Collectors.toList());
//
//            
//            linhasProcessadas.forEach(System.out::println);
//
//            
//            Path pathSaida = Paths.get(caminhoSaida);
//            Files.write(pathSaida, linhasProcessadas);
//
//            
//            linhas.close();
//        } catch (IOException e) {
//            System.out.println("Ocorreu um erro ao processar o arquivo: " + e.getMessage());
//        }
//    }

//    private static String processarLinha(String linha) {
//        StringBuilder resultado = new StringBuilder();
//        boolean encontrouMaiuscula = false;
//
//        for (char c : linha.toCharArray()) {
//            if (Character.isUpperCase(c)) {
//                encontrouMaiuscula = true;
//            }
//
//            if (encontrouMaiuscula) {
//                if (Character.isLetterOrDigit(c) || Character.isWhitespace(c)) {
//                    resultado.append(c);
//                }
//            }    
//        }
//
//        return resultado.toString();
    }
}


