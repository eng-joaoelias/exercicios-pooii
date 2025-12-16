package classobj;

/*
 * Crie uma classe chamada Triângulo com os atributos base e altura.
 * Adicione um construtor e um método para calcular a área do triângulo.
 * Crie 3 objetos e teste os métodos.
 */

public class Triangulo {
	
	//Criação "compacta" dos atributos, para economizar uma linha
	private double base, altura;
	
	//Construtor completo
	public Triangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}
	
	//Construtor vazio
	public Triangulo() {
		super();
	}
	
	//Getters e Setters
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	//Calcular a área do triângulo
	public double calcArea() {
		return this.getBase() * this.getAltura() / 2;
	}
}
