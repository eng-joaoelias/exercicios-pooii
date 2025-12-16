package heranca;

public class VeiculosMain {
    public static void main(String[] args) {
        
        // 1. Criação dos objetos
        Carro meuCarro = new Carro("Honda", "Civic", 2023, 4);
        Caminhao meuCaminhao = new Caminhao("Volvo", "FH16", 2020, 25.5);
        
        System.out.println("--- Teste de Herança e Polimorfismo ---");
        
        // 2. Demonstração do Carro
        System.out.println("\n--- DETALHES DO CARRO ---");
        System.out.println(meuCarro.exibirDetalhes()); // Método herdado e sobrescrito
        
        meuCarro.ligar();
        meuCarro.acelerar(); // Chama o método acelerar específico de Carro (+7)
        meuCarro.acelerar(); 
        meuCarro.frear();    // Chama o método frear específico de Carro (-7)
        meuCarro.desligar();

        // 3. Demonstração do Caminhão
        System.out.println("\n--- DETALHES DO CAMINHÃO ---");
        System.out.println(meuCaminhao.exibirDetalhes()); // Método herdado e sobrescrito
        
        meuCaminhao.ligar();
        meuCaminhao.acelerar(); // Chama o método acelerar específico de Caminhao (+4)
        meuCaminhao.acelerar(); 
        meuCaminhao.acelerar(); 
        meuCaminhao.frear();    // Chama o método frear específico de Caminhao (-4)
        meuCaminhao.desligar();
        
        // 4. Demonstração de Polimorfismo com a Superclasse
        System.out.println("\n--- POLIMORFISMO: Array de Veiculos ---");
        
        Veiculo[] frota = new Veiculo[2];
        frota[0] = meuCarro;
        frota[1] = meuCaminhao;
        
        for (Veiculo v : frota) {
            // A chamada para 'acelerar' será resolvida em tempo de execução
            // para o método CORRETO (Carro.acelerar ou Caminhao.acelerar)
            // Note: Precisamos de um método public no Carro/Caminhao que chame o acelerar protected
            System.out.println("\nAcelerando " + v.getModelo() + " (Velocidade antes: " + v.getVelocidadeAtual() + ")");
            
            // Necessidade de um método public para acessar o protected:
            if (v instanceof Carro) {
                ((Carro) v).acelerar(); // Chamada forçada (casting)
            } else if (v instanceof Caminhao) {
                 ((Caminhao) v).acelerar(); // Chamada forçada (casting)
            }
        }
    }
}