package heranca;

public class Animal {
	private String nome;
	private int idade;
	private double peso;
	private String especie;
	private boolean vivo;
	
	public Animal(String nome, int idade, String especie) {
	    this.nome = nome;
	    this.idade = idade;
	    this.especie = especie;
	    this.vivo = true;
	    this.peso = 0.0;
	}
	
	public void fazerSom() {
		System.out.println("Reproduzindo som!");
	}
	
	public void mover() {
		System.out.println("Movendo-se!");
	}
	
	public void comer() {
		System.out.println("Estou me alimentando!");
	}
	
	public void dormir() {
		System.out.println("Zzzzzzzzzzz");
	}
	
	public String toString() {
		return "O nome do animal é " + this.getNome() + ", tem " + this.getIdade() + " anos" + (this.isVivo()? ", está vivo." : ", está morto.") + "e trata-se de " + this.getClass();
	}
	
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
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public boolean isVivo() {
		return vivo;
	}
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
	
	
}
