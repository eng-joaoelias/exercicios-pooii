package polimorfismo;

import java.util.ArrayList;

public class AnimalMain {

	public static void main(String[] args) {

		Animal cachorro = new Cachorro();
		Animal gatinho = new Gato();
		Animal vaca = new Vaca();
		
		ArrayList<Animal> animais = new ArrayList<Animal>();
		animais.add(cachorro);
		animais.add(gatinho);
		animais.add(vaca);
		
		for (Animal animal : animais) {
			animal.fazerSom();
		}

	}

}
