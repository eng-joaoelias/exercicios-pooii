package relclasses;

public class JogTimMain {
	// Método auxiliar para garantir que a associação bidirecional seja feita em uma única chamada.
    public static void associar(Time time, Jogador jogador) {
        // 1. O Time adiciona o Jogador à sua lista.
        time.adicionarJogador(jogador);
        
        // 2. O Jogador aponta para o Time.
        jogador.setTime(time);
    }
    
    public static void main(String[] args) {
        
        System.out.println("### Sistema de Gerenciamento de Elenco ###\n");
        
        // --- 1. Inicialização e Criação de Times ---
        
        // Para a execução, assumimos que a classe Time possui um construtor
        // que inicializa a lista: public Time(String nome, String sigla, String cidade) { ... this.listaJogadores = new ArrayList<>(); }
        
        Time flamengo = new Time("Clube de Regatas do Flamengo", "FLA", "Rio de Janeiro");
        Time palmeiras = new Time("Sociedade Esportiva Palmeiras", "PAL", "São Paulo");

        // Criação de jogadores
        Jogador gabigol = new Jogador();
        gabigol.setMatricula("JG001");
        gabigol.setNome("Gabriel Barbosa");
        gabigol.setPosicao("Atacante");
        gabigol.setNumCamisa(10);
        
        Jogador arrascaeta = new Jogador();
        arrascaeta.setMatricula("JA002");
        arrascaeta.setNome("Giorgian De Arrascaeta");
        arrascaeta.setPosicao("Meio-campista");
        arrascaeta.setNumCamisa(14);
        
        Jogador weverton = new Jogador();
        weverton.setMatricula("JW003");
        weverton.setNome("Weverton Pereira da Silva");
        weverton.setPosicao("Goleiro");
        weverton.setNumCamisa(21);

        System.out.println("1. Times e Jogadores Criados.\n");

        // --- 2. Associação Bidirecional ---
        
        System.out.println("2. Associando Jogadores aos Times:");
        
        // Associando Gabi e Arrascaeta ao Flamengo
        associar(flamengo, gabigol);
        associar(flamengo, arrascaeta);
        System.out.println("   - Flamengo agora tem " + flamengo.contarJogadores() + " jogadores.");
        
        // Associando Weverton ao Palmeiras
        associar(palmeiras, weverton);
        System.out.println("   - Palmeiras agora tem " + palmeiras.contarJogadores() + " jogador.\n");

        // --- 3. Testando Busca e Remoção ---

        // Teste de busca no Flamengo
        Jogador jBuscado = flamengo.buscarJogador(gabigol);
        if (jBuscado != null) {
            System.out.println("3. Busca por " + jBuscado.getNome() + " no Flamengo: Sucesso.");
        }
        
        // Teste de remoção (Transferência)
        System.out.println("\n4. Transferência: Arrascaeta vai para o Palmeiras.");
        
        // Remoção da lista do Time antigo (FLA)
        flamengo.removerJogador(arrascaeta);
        
        // Associação ao novo Time (PAL)
        associar(palmeiras, arrascaeta); 
        
        System.out.println("   - Flamengo tem " + flamengo.contarJogadores() + " jogador após a saída.");
        System.out.println("   - Palmeiras tem " + palmeiras.contarJogadores() + " jogadores após a chegada.\n");
        
        // --- 5. Exibição Completa ---
        
        System.out.println("--- DETALHES FINAIS DO ELENCO ---");
        
        System.out.println("\nElenco do " + palmeiras.getNome() + ":");
        for (Jogador jog : palmeiras.getListaJogadores()) {
            System.out.println("-> " + jog.getNome() + " (" + jog.getPosicao() + ") - Camisa " + jog.getNumCamisa());
        }
        
        // Exemplo de como a associação do jogador funciona (Jogador conhece o Time)
        System.out.println(weverton.toString());
    }
}
