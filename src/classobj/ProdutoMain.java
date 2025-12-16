package classobj;

public class ProdutoMain {

	public static void main(String[] args) {

		//Instâncias usando o Construtor Completo
		Produto p1 = new Produto("Monitor Gamer 27'", 1299.00, 50);
		Produto p2 = new Produto("Teclado Mecânico", 350.50, 100);
		Produto p3 = new Produto("Mousepad Grande", 55.00, 300);

		//Instâncias usando Construtor Vazio e Setters
		Produto p4 = new Produto();
		p4.setNome("Webcam HD");
		p4.setPreco(189.90);
		p4.setQtdEstoque(75);

		Produto p5 = new Produto();
		p5.setNome("Cadeira Ergonômica");
		p5.setPreco(850.00);
		p5.setQtdEstoque(40);

		//Exibir o estado inicial de todos
		p1.exibirInformacoes();
		p2.exibirInformacoes();
		p3.exibirInformacoes();
		p4.exibirInformacoes();
		p5.exibirInformacoes();

		System.out.println("\n" + "---");

		//Teste de Remoção (Bem-sucedido)
		System.out.println("-> Removendo 10 unidades de " + p1.getNome() + "...");
		p1.remUnidadeEstoque(10);
		p1.exibirInformacoes();

		System.out.println("\n-> Adicionando 25 unidades de " + p1.getNome() + "...");
		p1.addUnidadeEstoque(25);
		p1.exibirInformacoes();

		//Teste de Estoque Insuficiente (Deve dar ERRO)
		System.out.println("\n-> Tentando remover 100 unidades...");
		p1.remUnidadeEstoque(100); //Erro: quantidade a ser removida é maior do que o estoque
		p1.exibirInformacoes();

		System.out.println("\n" + "---");

		//Teste de Cálculo (Produto 5: Cadeira Ergonômica

		System.out.println("-> Antes da mudança:");
		p5.exibirInformacoes(); // Valor Total: 40 * 850.00 = 34000.00

		//Alteração no Estoque
		System.out.println("\n-> Adicionando 10 cadeiras...");
		p5.addUnidadeEstoque(10); // Novo Estoque: 50

		//Verificação do Recálculo
		System.out.println("\n-> Após a mudança (Recálculo automático):");
		p5.exibirInformacoes(); // Novo Valor Total: 50 * 850.00 = 42500.00

	}

}
