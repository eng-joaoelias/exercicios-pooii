package heranca;

public class Cachorro extends Animal{

	public Cachorro(String nome, int idade, String especie) {
		super(nome, idade, especie);
	}
	
	@Override
	public void fazerSom() {
		System.out.println("Au Au! Au Au!");
	}
	
	@Override
	public void mover() {
		System.out.println("Andando!");
	}
	
	@Override
	public void comer() {
		System.out.println("Que carne saborosa!");
	}
	

}
