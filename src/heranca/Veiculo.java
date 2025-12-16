package heranca;

public class Veiculo {
	private String marca;
	private String modelo;
	private int ano;
	private double peso;
	private double velocidadeAtual;
	private boolean motorLigado;
	private String cor;
	private String tipoCombustivel;
	
	public Veiculo(String marca, String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	
	public Veiculo() {
		
	}

	protected void ligar() {
		this.setMotorLigado(true);
	}
	
	protected void desligar() {
		this.setMotorLigado(false);
	}
	
	protected void acelerar() {
		System.out.println("O veículo está acelerando!");
	}
	
	protected void frear() {
		System.out.println("O veículo está freando!");
	}
	
	public String exibirDetalhes() {
		return "Marca: " + this.getMarca() + "\nModelo: " + this.getModelo() + "Ano: " + this.getAno() + "\nPeso: " + this.getPeso()
				+ "\nVelocidade atual: " + this.getVelocidadeAtual() + "\nMotor está ligado? " + (this.isMotorLigado()? "Sim" : "Não")+ "\nCor: " + cor
				+ "\nTipo de combustivel: " + this.getTipoCombustivel();
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}
	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	public boolean isMotorLigado() {
		return motorLigado;
	}
	public void setMotorLigado(boolean motorLigado) {
		this.motorLigado = motorLigado;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	
	
}
