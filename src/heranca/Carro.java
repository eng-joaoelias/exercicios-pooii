package heranca;

public class Carro extends Veiculo{
	
	private int numeroDePortas;
	
	public Carro(String marca, String modelo, int ano, int numeroDePortas) {
		super(marca, modelo, ano);
		this.numeroDePortas = numeroDePortas;
	}

	public int getNumeroDePortas() {
		return numeroDePortas;
	}

	public void setNumeroDePortas(int numeroDePortas) {
		this.numeroDePortas = numeroDePortas;
	}
	
	@Override
	protected void acelerar() {
		this.setVelocidadeAtual(this.getVelocidadeAtual() + 7); //aumento de 7km/h na velocidade
	}
	
	@Override
	protected void frear() {
		// Lógica de segurança para não deixar a velocidade negativa
        if (this.getVelocidadeAtual() >= 7) {
            this.setVelocidadeAtual(this.getVelocidadeAtual() - 7); 
        } else {
            this.setVelocidadeAtual(0);
        }
	}
}
