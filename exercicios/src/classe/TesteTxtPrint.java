package classe;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class TesteTxtPrint {
	
	public static void main(String[] args) {
		
		String nomeArquivo = "C:/Users/Du.Du/Desktop/estudos/testes01/exercicios/Arquivo de Apoio/teste01.txt"; // Substitua pelo nome do seu arquivo

			try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
				String linha;
				while ((linha = br.readLine()) != null) {
					System.out.println(linha);
		        }
		        } catch (IOException e) {
		            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
		        }
		    }
		



}
