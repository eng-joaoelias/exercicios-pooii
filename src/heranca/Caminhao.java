package heranca;

public class Caminhao extends Veiculo{
	
	private double capacidadeDeCarga;
	
	public Caminhao(String marca, String modelo, int ano, double capacidadeDeCarga) {
		super(marca, modelo, ano);
		this.capacidadeDeCarga = capacidadeDeCarga;
	}
	
	public double getCapacidadeDeCarga() {
		return capacidadeDeCarga;
	}

	public void setCapacidadeDeCarga(double capacidadeDeCarga) {
		this.capacidadeDeCarga = capacidadeDeCarga;
	}

	@Override
	protected void acelerar() {
		this.setVelocidadeAtual(this.getVelocidadeAtual() + 4); //aumento de 4km/h na velocidade
	}
	
	@Override
	protected void frear() {
		// Lógica de segurança para não deixar a velocidade negativa
        if (this.getVelocidadeAtual() >= 4) {
            this.setVelocidadeAtual(this.getVelocidadeAtual() - 4); 
        } else {
            this.setVelocidadeAtual(0);
        }
	}
	
}
