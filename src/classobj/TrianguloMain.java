package classobj;

public class TrianguloMain {

	public static void main(String[] args) {
		
		//Criação de três objetos do tipo Triangulo
		Triangulo t1 = new Triangulo();
		Triangulo t2 = new Triangulo();
		Triangulo t3 = new Triangulo();
		
		//Atribuição de valores de base e altura com setters
		t1.setBase(34);
		t1.setAltura(56);
		t2.setBase(23.9874);
		t2.setAltura(30.90586);
		t3.setBase(12.6824);
		t3.setAltura(21.7958);
		
		//Cálculo da área
		System.out.println("Área do triângulo 1: " + t1.calcArea());
		System.out.println("Área do triângulo 2: " + t2.calcArea());
		System.out.println("Área do triângulo 3: " + t3.calcArea());

	}

}
