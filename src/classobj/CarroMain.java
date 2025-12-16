package classobj;

//Classe de teste para a entidade Carro. Cria 5 carros e testa os métodos

public class CarroMain {
public static void main(String[] args) {
		
		//1. Criação das Instâncias
		
		//Instância usando o CONSTRUTOR COMPLETO
		Carro c1 = new Carro("Ford", "Mustang", 1969);
		Carro c2 = new Carro("Chevrolet", "Camaro", 2020);
		Carro c3 = new Carro("Toyota", "Corolla", 2023);
		
		// 4. Instância usando o CONSTRUTOR VAZIO e SETTERS
		Carro c4 = new Carro();
		c4.setMarca("Honda");
		c4.setModelo("Civic");
		c4.setAnoFabricacao(2022);
		Carro c5 = new Carro();
		c5.setMarca("Fiat");
		c5.setModelo("Uno");
		c5.setAnoFabricacao(1995);
		
		// --- Demonstração dos Métodos ---
		
		System.out.println("Informações do Carro 1:");
		c1.exibirInformacoes();
		System.out.println("\nInformações do Carro 4:");
		c4.exibirInformacoes();

		// Demonstração dos GETTERS
		System.out.println("Marca do Carro 2: " + c2.getMarca()); // Usando Getter
		System.out.println("Modelo do Carro 2: " + c2.getModelo()); // Usando Getter
		
		System.out.println("\n");
		
		// Demonstração dos SETTERS
		System.out.println("Antes da Atualização (Carro 3):");
		c3.exibirInformacoes();
		
		// Atualizando o ano de fabricação do Carro 3 usando SETTER
		c3.setAnoFabricacao(2024); // Usando Setter
		
		System.out.println("\nDepois da Atualização (Carro 3):");
		c3.exibirInformacoes();
		
		System.out.println("\n" + "---");
		
		System.out.println("\nExibição de Todos os Carros\n");
		
		// Exibindo informações de todas as 5 instâncias
		System.out.println("-> Carro 1:");
		c1.exibirInformacoes();
		System.out.println("\n-> Carro 2:");
		c2.exibirInformacoes();
		System.out.println("\n-> Carro 3 (Atualizado):");
		c3.exibirInformacoes();
		System.out.println("\n-> Carro 4:");
		c4.exibirInformacoes();
		System.out.println("\n-> Carro 5:");
		c5.exibirInformacoes();
	}
}
