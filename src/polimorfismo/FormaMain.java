package polimorfismo;

import java.util.ArrayList;

public class FormaMain {

	public static void main(String[] args) {
		
		Circulo circulo = new Circulo();
		circulo.setRaio(43.7);
		Retangulo retangulo = new Retangulo();
		retangulo.setAltura(20);
		retangulo.setBase(35.76);
		Triangulo triangulo = new Triangulo();
		triangulo.setAltura(20);
		triangulo.setBase(35.76);
		
		ArrayList<Forma> formas = new ArrayList<Forma>();
		
		formas.add(circulo);
		formas.add(retangulo);
		formas.add(triangulo);
		
		for (Forma forma : formas) {
			System.out.println(forma.calcularArea());
		}

	}

}
