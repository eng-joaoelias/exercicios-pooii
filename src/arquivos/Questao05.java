package arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Questao05 {
	
	public static String lerStringArquivo(String caminhoArquivo) {
		
		StringBuilder conteudo = new StringBuilder();
		String linha;
		
		try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))){
			
			
			while ((linha = br.readLine()) != null) {
				
				conteudo.append(linha).append(System.lineSeparator());
			}
		} catch (IOException e) {
			System.err.println("Erro ao ler o arquivo: " + e.getMessage());
			return null;
		}
		return conteudo.toString();
	}
	
	public static boolean gravarStrings(String textoArquivo, String nomeArquivo) {
        
        try (
            
            FileWriter fw = new FileWriter(nomeArquivo, false);
            
            PrintWriter pw = new PrintWriter(fw)
        ) {
        	pw.println(textoArquivo);

            System.out.println("Sucesso! As strings foram gravadas em: " + new java.io.File(nomeArquivo).getAbsolutePath());
            return true;

        } catch (IOException e) {
            System.err.println("Erro ao gravar as strings no arquivo: " + e.getMessage());
            return false;
        }
    }

	public static void main(String[] args) {
		
		gravarStrings(lerStringArquivo("source.txt"), "destination.txt");

	}

}
