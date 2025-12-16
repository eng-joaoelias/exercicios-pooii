package interfaces;

public class Engenheiro implements Trabalhador {

	@Override
	public void falar() {
		System.out.println("A ciência estuda o que é; a engenharia cria o que nunca foi.");
	}

	@Override
	public void trabalhar() {
		System.out.println("É hora de fazer projeto.");
	}

}
