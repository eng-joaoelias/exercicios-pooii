package heranca;

public class FuncionariosMain {
public static void main(String[] args) {
        
        // 1. Instanciando a Superclasse Funcionario
        Funcionario funcionarioPadrao = new Funcionario(
            "Maria da Silva", 
            3500.00, 
            "F1001", 
            "Marketing", 
            "01/03/2020"
        );
        
        // 2. Instanciando a Subclasse Gerente
        // Observe que a gratificação é definida usando o setter, pois ela não está no construtor
        Gerente gerenteSetor = new Gerente(
            "João de Souza", 
            8000.00, 
            "G2002", 
            "Financeiro", 
            "15/07/2018"
        );
        
        // 3. Definindo a gratificação para o Gerente
        // Usaremos uma gratificação de 20% (modelo percentual que você implementou)
        gerenteSetor.setGratificacao(20.0);
        
        System.out.println("--- Detalhes do Funcionário Padrão ---");
        System.out.println(funcionarioPadrao.exibirDetalhes());
        System.out.printf("Salário Calculado: R$ %.2f\n", funcionarioPadrao.calcularSalario());
        
        System.out.println("\n--- Detalhes do Gerente ---");
        // O método exibirDetalhes() é herdado, mas a gratificação não é exibida, pois não está na superclasse
        System.out.println(gerenteSetor.exibirDetalhes());
        System.out.printf("Gratificação: %.2f%%\n", gerenteSetor.getGratificacao());
        
        // Polimorfismo: O método calcularSalario() do Gerente é chamado
        gerenteSetor.calcularSalario();
        System.out.printf("Salário Calculado (Base + Gratificação de 20%%): R$ %.2f\n", gerenteSetor.getSalario());
        
    }
}
