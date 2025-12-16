package heranca;

// Classe para testar a hierarquia Pessoa -> Aluno, Professor
public class PessoasMain {

    public static void main(String[] args) {
        
        System.out.println("--- Teste de Instanciação e Herança (Pessoa) ---\n");
        
        // 1. Instanciando a classe base (Pessoa)
        Pessoa p = new Pessoa("Maria Silva", "15/05/1980");
        System.out.println("Detalhes da Pessoa:");
        System.out.println(p.toString());
        
        System.out.println("\n----------------------------------------------\n");
        
        // 2. Instanciando a subclasse Aluno
        Aluno a = new Aluno("João Pereira", "10/01/2005", "2024150001");
        System.out.println("Detalhes do Aluno (Herança e Atributo Específico):");
        // O toString() de Aluno chama o toString() de Pessoa
        System.out.println(a.toString());
        
        System.out.println("\n----------------------------------------------\n");
        
        // 3. Instanciando a subclasse Professor
        Professor prof = new Professor("Carlos Eduardo", "20/07/1975", "Doutorado em Computação");
        System.out.println("Detalhes do Professor (Herança e Atributo Específico):");
        // O toString() de Professor chama o toString() de Pessoa
        System.out.println(prof.toString());
        
        System.out.println("\n----------------------------------------------\n");
        
        // 4. Demonstração de Polimorfismo (Tratando Aluno e Professor como Pessoa)
        System.out.println("Teste de Polimorfismo (Array de Pessoas):");
        
        Pessoa[] listaDePessoas = new Pessoa[3];
        listaDePessoas[0] = p; // Pessoa
        listaDePessoas[1] = a; // Aluno (tratado como Pessoa)
        listaDePessoas[2] = prof; // Professor (tratado como Pessoa)
        
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println("\n--- Objeto: " + pessoa.getClass().getSimpleName() + " ---");
            // O Java chama o toString() correto (sobrescrito) para cada objeto.
            System.out.println(pessoa); 
        }
    }
}