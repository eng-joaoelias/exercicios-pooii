package arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Questao03 {
	public static void main(String[] args) {
		
		int contadorLinhas = 0;
		
		try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))){
			String linha;
			
			while ((linha = br.readLine()) != null) {
				contadorLinhas++;
				
			}
		} catch (IOException e) {
			System.err.println("Erro ao ler o arquivo: " + e.getMessage());
		}
		
		System.out.println("Quantidade de linhas: " + contadorLinhas);
	}
}
