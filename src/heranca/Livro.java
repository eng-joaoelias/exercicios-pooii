package heranca;

public class Livro {
	private String titulo;
	private String autor;
	private String ISBN;
	private int anoPublicacao;
	private String editora;
	private String genero;
	
	public Livro(String titulo, String autor, String iSBN, int anoPublicacao, String editora,
			String genero) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		ISBN = iSBN;
		this.anoPublicacao = anoPublicacao;
		this.editora = editora;
		this.genero = genero;
	}
	
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String obterDetalhes() {
		return "\nTitulo: " + titulo + "\nAutor: " + autor + "\nISBN: " + ISBN + "\nAno de publicação: " + anoPublicacao
				+ "\nEditora: " + editora + "\nGênero: " + genero;
	}	
	
	
}
