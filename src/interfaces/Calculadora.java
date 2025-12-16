package interfaces;

public class Calculadora implements ConstantesMatematicas {
	
	public double areaDoCirculo(double raio) {
		return ConstantesMatematicas.PI * raio * raio;
	}
	
	public double calcularJuroCompostoContinuo(double capInicial, double taxaJurosAnual, double tempoAnos) {
		return capInicial * Math.pow(ConstantesMatematicas.E, taxaJurosAnual * tempoAnos);
	}
	
}
