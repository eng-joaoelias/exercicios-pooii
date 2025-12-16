package classobj;

/*
 * Crie uma classe chamada Livro com os atributos título, autor
 * e número de páginas. Adicione um construtor e métodos getters
 * e setters para todos os atributos. Crie 5 objetos do tipo Livro
 * e teste os métodos criados.
*/

public class Livro {
	//Atributos solicitados. Encapsulamento nivel private
	private String titulo;
	private String autor;
	private int numPags;
	
	//Metodo construtor. Obrigatóriop já inicioalizar os atributos
	public Livro(String titulo, String autor, int numPags) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.numPags = numPags;
	}
	
	//Getters e Setters abaixo
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
	public int getNumPags() {
		return numPags;
	}
	public void setNumPags(int numPags) {
		this.numPags = numPags;
	}
	
	
}
