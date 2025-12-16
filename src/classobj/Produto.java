package classobj;

/*
 * Crie uma classe chamada Produto com os atributos nome, preço e
 * quantidade em estoque. Implemente métodos para calcular o
 * valor total em estoque desse produto e para adicionar e remover
 * unidades do estoque. Crie 5 objetos do tipo produto e teste os
 * métodos criados.
 */

public class Produto {
	//Criação dos atributos
	private String nome;
	private double preco;
	private int qtdEstoque;

	//Construtor Completo
	public Produto(String nome, double preco, int qtdEstoque) {
		this.nome = nome;
		this.preco = preco;
		//Garante que o estoque inicial não seja negativo
		this.qtdEstoque = Math.max(0, qtdEstoque); 
	}

	//Construtor Vazio
	public Produto() {
	}

	//Getters e Setters para manipulação dos atributos.
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQtdEstoque() {
		return qtdEstoque;
	}
	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	//Adicao de uma quantidade qualquer no estoque
	public int addUnidadeEstoque(int qtdAdd) {
		if (qtdAdd > 0) {
			this.setQtdEstoque(this.getQtdEstoque() + qtdAdd);
		}
		return this.getQtdEstoque();
	}

	//Remoção de uma quantidade qualquer no estoque
	public int remUnidadeEstoque(int qtdRem) {
		if (qtdRem <= this.getQtdEstoque()) {
			this.setQtdEstoque(this.getQtdEstoque() - qtdRem);
		}
		return this.getQtdEstoque();
	}

	//Calcular o valor total em estoque desse produto
	public double calcVlrTotEstoque() {
		return this.getQtdEstoque() * this.getPreco();
	}

	//Exibir as informações do produto
	public void exibirInformacoes() {
		System.out.printf("Produto: %s | Preço: R$ %.2f | Estoque: %d unidades | Valor Total: R$ %.2f\n",
				nome, preco, qtdEstoque, calcVlrTotEstoque());
	}

}
