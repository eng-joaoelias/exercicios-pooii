package heranca;

public class LivroFisico extends Livro {
	
	private int numeroDePaginas;

	public LivroFisico(String titulo, String autor, String iSBN, int anoPublicacao, String editora, String genero, int numeroDePaginas) {
		super(titulo, autor, iSBN, anoPublicacao, editora, genero);
		this.numeroDePaginas = numeroDePaginas;
	}

	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}

	public void setNumeroDePaginas(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}
	
	

}
