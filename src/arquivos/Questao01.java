package arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Questao01 {

	public static void main(String[] args) {
		
		System.out.println("Conteúdo do arquivo lido: ");
		
		try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))){
			String linha;
			int contadorLinhas = 1;
			
			while ((linha = br.readLine()) != null) {
				System.out.println(linha);
				
			}
		} catch (IOException e) {
			System.err.println("Erro ao ler o arquivo: " + e.getMessage());
		}
	}

}
