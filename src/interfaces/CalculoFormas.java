package interfaces;

import java.util.ArrayList;

public class CalculoFormas {

	public static void main(String[] args) {
		
		Circulo c1 = new Circulo();
		Circulo c2 = new Circulo();
		Circulo c3 = new Circulo();
		c1.setRaio(5);
		c2.setRaio(13);
		c3.setRaio(22);
		
		Retangulo r1 = new Retangulo();
		Retangulo r2 = new Retangulo();
		Retangulo r3 = new Retangulo();
		r1.setBase(7);
		r1.setAltura(11);
		r2.setBase(9);
		r2.setAltura(12);
		r3.setBase(15);
		r3.setAltura(18);
		
		ArrayList<Forma> formas = new ArrayList<Forma>();
		
		formas.add(c1);
		formas.add(c2);
		formas.add(c3);
		
		formas.add(r1);
		formas.add(r2);
		formas.add(r3);
		calculoAreas(formas);

		
	}
	
	public static void calculoAreas(ArrayList<Forma> formas) {
		for (Forma forma : formas) {
			System.out.println("Área da forma: " + forma.calcularArea());
		}
	}

}
