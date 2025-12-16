package relclasses;

public class ContPaisMain {
	public static void main(String[] args) {
        // 1. Criação do Continente (a)
        Continente americaDoSul = new Continente("América do Sul");

        // 2. Criação dos Países
        Pais brasil = new Pais("Brasil", 8515767, 217000000L); // ~8.5 milhões km², ~217 milhões hab.
        Pais argentina = new Pais("Argentina", 2780400, 46000000L); // ~2.7 milhões km², ~46 milhões hab.
        Pais chile = new Pais("Chile", 756102, 19600000L); // ~756 mil km², ~19.6 milhões hab.

        // 3. Adição de Países ao Continente (b)
        americaDoSul.adicionarPais(brasil);
        americaDoSul.adicionarPais(argentina);
        americaDoSul.adicionarPais(chile);

        // 4. Teste dos Métodos (c, d, e, f, g)
        System.out.println("--- Dados do " + americaDoSul.getNome() + " ---");
        
        // c) Dimensão Total
        double dimensaoTotal = americaDoSul.getDimensaoTotal();
        System.out.printf("Dimensão Total: %.2f km²\n", dimensaoTotal);

        // d) População Total
        long populacaoTotal = americaDoSul.getPopulacaoTotal();
        System.out.printf("População Total: %,d habitantes\n", populacaoTotal);

        // e) Densidade Populacional
        double densidade = americaDoSul.getDensidadePopulacional();
        System.out.printf("Densidade Populacional: %.2f hab/km²\n", densidade); // $ \text{hab} / \text{km}^2 $

        // f) País com Maior População
        Pais maiorPop = americaDoSul.getPaisMaiorPopulacao();
        if (maiorPop != null) {
            System.out.println("País com Maior População: " + maiorPop.getNome() + " (" + maiorPop.getPopulacao() + " hab)");
        }

        // g) País com Menor População
        Pais menorPop = americaDoSul.getPaisMenorPopulacao();
        if (menorPop != null) {
            System.out.println("País com Menor População: " + menorPop.getNome() + " (" + menorPop.getPopulacao() + " hab)");
        }
    }
}
