package heranca;

public class Ebook extends Livro {
	
	private double tamanhoArquivo;

	public Ebook(String titulo, String autor, String iSBN, int anoPublicacao, String editora, String genero, double tamanhoArquivo) {
		super(titulo, autor, iSBN, anoPublicacao, editora, genero);
		this.tamanhoArquivo = tamanhoArquivo;
	}

	public double getTamanhoArquivo() {
		return tamanhoArquivo;
	}

	public void setTamanhoArquivo(double tamanhoArquivo) {
		this.tamanhoArquivo = tamanhoArquivo;
	}
	
	
}
