package classobj;

/*
 * Crie uma classe chamada Carro com os atributos marca, modelo e
 * ano de fabricação. Implemente construtores para inicializar
 * esses atributos e métodos para exibir as informações do carro.
 * Crie 5 objetos do tipo Carro e teste os métodos.
 */

public class Carro {
	
	private String marca;
	private String modelo;
	private int anoFabricacao;
	
	//Construtor da classe
	public Carro(String marca, String modelo, int anoFabricacao) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
	}
	
	/*Construtor vazio se for necessario inicializar os atributos 
	 * em outro momento.
	 */
	public Carro() {
		super();
	}

	//Getters e Setters
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

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	
	// EXTRA: método para exibir as informações do carro
		public void exibirInformacoes() {
			System.out.println("Marca: " + marca);
			System.out.println("Modelo: " + modelo);
			System.out.println("Ano de Fabricação: " + anoFabricacao);
		}
}
