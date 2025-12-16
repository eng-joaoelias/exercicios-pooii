package heranca;

public class Vaca extends Animal{
	
	public Vaca(String nome, int idade, String especie) {
		super(nome, idade, especie);
	}
	
	@Override
	public void fazerSom() {
		System.out.println("Muuuuuuu...");
	}
	
	@Override
	public void mover() {
		System.out.println("Andando!");
	}
	
	@Override
	public void comer() {
		System.out.println("Capim delicioso!");
	}
}
