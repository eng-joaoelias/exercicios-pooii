package heranca;

public class Gato extends Animal{

	public Gato(String nome, int idade, String especie) {
		super(nome, idade, especie);
	}
	
	@Override
	public void fazerSom() {
		System.out.println("Miau! Miau!");
	}
	
	@Override
	public void mover() {
		System.out.println("Andando!");
	}
	
	@Override
	public void comer() {
		System.out.println("Adorei o peixe!");
	}

}
