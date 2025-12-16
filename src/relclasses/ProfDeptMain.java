package relclasses;


public class ProfDeptMain {

    public static void main(String[] args) {
        
        System.out.println("### Sistema de Associação de Professores e Departamentos ###\n");
        
        // --- 1. Criação dos Departamentos ---
        
        // É necessário inicializar a lista de professores no construtor
        // da classe Departamento, que não foi fornecido. 
        // Para que o código funcione, vamos supor que a classe Departamento
        // tenha o seguinte construtor (e que a inicialização da lista ocorra nele):
        // public Departamento(String nome, String sigla) {
        //     this.nome = nome;
        //     this.sigla = sigla;
        //     this.listaProfessores = new ArrayList<>(); // Inicialização crucial!
        // }
        
        // Criando departamentos (assumindo a inicialização da lista)
        Departamento dcc = new Departamento("Departamento de Ciência da Computação", "DCC");
        dcc.getListaProfessores().clear(); // Limpa se houver algo (apenas para fins de teste)
        
        Departamento dae = new Departamento("Departamento de Administração e Economia", "DAE");
        dae.getListaProfessores().clear(); 

        System.out.println("1. Departamentos Criados:");
        System.out.println("   - " + dcc.getNome() + " (" + dcc.getSigla() + ")");
        System.out.println("   - " + dae.getNome() + " (" + dae.getSigla() + ")\n");
        
        // --- 2. Criação dos Professores ---
        
        Professor prof1 = new Professor();
        prof1.setMatricula("P1001");
        prof1.setNome("Dr. Alan Turing");
        prof1.setTitulacao("Doutorado");
        prof1.setRegimeTrabalho("Dedicação Exclusiva");
        
        Professor prof2 = new Professor();
        prof2.setMatricula("P2002");
        prof2.setNome("Ms. Ada Lovelace");
        prof2.setTitulacao("Mestrado");
        prof2.setRegimeTrabalho("20 horas");
        
        Professor prof3 = new Professor();
        prof3.setMatricula("P3003");
        prof3.setNome("Dr. John Von Neumann");
        prof3.setTitulacao("Doutorado");
        prof3.setRegimeTrabalho("Dedicação Exclusiva");

        System.out.println("2. Professores Criados.\n");
        
        // --- 3. Associação Bidirecional ---
        
        // Associando prof1 ao DCC
        prof1.setDepartamento(dcc);
        dcc.adicionarProfessor(prof1);
        
        // Associando prof2 ao DCC
        prof2.setDepartamento(dcc);
        dcc.adicionarProfessor(prof2);
        
        // Associando prof3 ao DAE
        prof3.setDepartamento(dae);
        dae.adicionarProfessor(prof3);

        System.out.println("3. Associações Realizadas (Professor -> Departamento e Departamento -> Professor).\n");

        // --- 4. Testando Métodos do Departamento ---

        System.out.println("4. Status dos Departamentos:");
        
        System.out.println("   - " + dcc.getNome() + " tem " + dcc.contarProfessores() + " professores.");
        System.out.println("   - " + dae.getNome() + " tem " + dae.contarProfessores() + " professores.");
        
        // Teste de busca
        Professor pBuscado = dcc.buscarProfessor(prof2);
        if (pBuscado != null) {
            System.out.println("   - Busca no DCC por " + prof2.getNome() + ": Sucesso.");
        }
        
        // Teste de adição duplicada (deve retornar false)
        boolean adicionouDuplicado = dcc.adicionarProfessor(prof1);
        System.out.println("   - Tentativa de adicionar Alan Turing novamente (DCC): " + (adicionouDuplicado ? "Sucesso" : "Falha (Correto)"));
        
        // --- 5. Testando Alteração de Lotação (Mudança de Departamento) ---
        
        System.out.println("\n5. Mudança de Lotação: John Von Neumann muda para DCC.");

        // 1. Remove do departamento antigo (DAE)
        dae.removerProfessor(prof3);
        
        // 2. Associa prof3 ao novo departamento (DCC)
        prof3.setDepartamento(dcc);
        
        // 3. Adiciona no novo departamento (DCC)
        dcc.adicionarProfessor(prof3);
        
        System.out.println("   - " + dcc.getNome() + " agora tem " + dcc.contarProfessores() + " professores.");
        System.out.println("   - " + dae.getNome() + " agora tem " + dae.contarProfessores() + " professores.");
        
        // --- 6. Exibição Completa ---
        
        System.out.println("\n--- DETALHES COMPLETOS ---\n");

        // Imprime a lista de professores do DCC e as informações do professor
        System.out.println("Professores em " + dcc.getNome() + " (" + dcc.contarProfessores() + "):");
        for (Professor prof : dcc.getListaProfessores()) {
            System.out.println(prof.toString());
        }
    }
}