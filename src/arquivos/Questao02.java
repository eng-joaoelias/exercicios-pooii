package arquivos;

import java.util.List;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Questao02 {
	public static void gravarStrings(List<String> strings, String nomeArquivo) {
        
        try (
            
            FileWriter fw = new FileWriter(nomeArquivo, false);
            
            PrintWriter pw = new PrintWriter(fw)
        ) {
            for (String str : strings) {
                
                pw.println(str);
            }

            System.out.println("Sucesso! As strings foram gravadas em: " + new java.io.File(nomeArquivo).getAbsolutePath());

        } catch (IOException e) {
            System.err.println("Erro ao gravar as strings no arquivo: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        
        List<String> dados = Arrays.asList(
            "Linha de exemplo aqui para demonstrar.",
            "Mais uma linha de texto.",
            "Fim da escrita."
        );

        String nomeDoArquivo = "output.txt";

        gravarStrings(dados, nomeDoArquivo);
    }
}
