package polimorfismo;

import java.util.ArrayList;

public class VeiculoMain {

	public static void main(String[] args) {

		Veiculo carro = new Carro();
		Veiculo motinha = new Moto();
		Veiculo bike = new Bicicleta();
		
		ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
		
		veiculos.add(bike);
		veiculos.add(motinha);
		veiculos.add(carro);
		
		for (Veiculo veiculo : veiculos) {
			veiculo.mover();
		}

	}

}
