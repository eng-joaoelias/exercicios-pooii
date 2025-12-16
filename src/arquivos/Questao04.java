package arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Questao04 {

	public static void main(String[] args) {
		
		int contadorPalavraJava = 0;
		
		try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))){
			String linha;
			
			while ((linha = br.readLine()) != null) {
				if (linha.contains("Java")) {
					contadorPalavraJava++;
				}
				
			}
		} catch (IOException e) {
			System.err.println("Erro ao ler o arquivo: " + e.getMessage());
		}
		
		System.out.println("Quantidade de vezes a palavra \"Java\" aparece no arquivo: " + contadorPalavraJava);
	}
}
