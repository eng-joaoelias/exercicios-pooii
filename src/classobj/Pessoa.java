package classobj;

/*
 * Crie uma classe chamada Pessoa com os atributos nome e idade.
 * Em seguida, crie um construtor para inicializar esses atributos
 * e métodos getters e setters para acessá-los. Crie 5 objetos do
 * tipo Pessoa e teste os métodos criados.
 */

public class Pessoa {
	
	
	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) { //Construtor com os campos nome e idade
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	//Getters e setters abaixo. Boas praticas para acesso aos atributos
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
}
