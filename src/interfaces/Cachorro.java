package interfaces;

public class Cachorro implements Animal {

	@Override
	public void som() {
		System.out.println("Latido");
	}

	@Override
	public void comer(String alimento) {
		System.out.println("Comendo " + alimento);
	}

	@Override
	public void mover() {
		
	}

}
