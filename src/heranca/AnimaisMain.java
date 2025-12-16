package heranca;

public class AnimaisMain {

	public static void main(String[] args) {
		Cachorro doguinho = new Cachorro("Luke", 4, "Canis familiaris");
		Gato cat = new Gato("Meliante", 6, "Gato malhado");
		Vaca cow = new Vaca("Gertrudes", 13, "Bos taurus");
		doguinho.fazerSom();
		cat.comer();
		cat.fazerSom();
		cat.toString();
		cow.fazerSom();
	}

}
