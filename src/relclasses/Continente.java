package relclasses;

import java.util.ArrayList;
import java.util.List;

public class Continente {
    private String nome;
    private List<Pais> paises;

    // a) Construtor que inicialize o nome do continente
    public Continente(String nome) {
        this.nome = nome;
        this.paises = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    // b) Um método que permita adicionar países aos continentes
    public void adicionarPais(Pais pais) {
        if (pais != null) {
            this.paises.add(pais);
        }
    }

    // c) Um método que retorne a dimensão total do continente
    public double getDimensaoTotal() {
        double dimensaoTotal = 0;
        for (Pais pais : paises) {
            dimensaoTotal += pais.getDimensao();
        }
        return dimensaoTotal; // Retorna em km²
    }

    // d) Um método que retorne a população total do continente
    public long getPopulacaoTotal() {
        long populacaoTotal = 0;
        for (Pais pais : paises) {
            populacaoTotal += pais.getPopulacao();
        }
        return populacaoTotal;
    }

    // e) Um método que retorne a densidade populacional do continente
    // Fórmula: Densidade = População Total / Dimensão Total
    public double getDensidadePopulacional() {
        double dimensao = getDimensaoTotal();
        long populacao = getPopulacaoTotal();

        if (dimensao > 0) {
            return (double) populacao / dimensao;
        } else {
            return 0.0; // Evita divisão por zero
        }
    }

    // f) Um método que retorne o país com maior população no continente
    public Pais getPaisMaiorPopulacao() {
        if (paises.isEmpty()) {
            return null;
        }

        Pais paisMaior = paises.get(0);
        for (Pais pais : paises) {
            if (pais.getPopulacao() > paisMaior.getPopulacao()) {
                paisMaior = pais;
            }
        }
        return paisMaior;
    }

    // g) Um método que retorne o país com menor população no continente
    public Pais getPaisMenorPopulacao() {
        if (paises.isEmpty()) {
            return null;
        }

        Pais paisMenor = paises.get(0);
        for (Pais pais : paises) {
            if (pais.getPopulacao() < paisMenor.getPopulacao()) {
                paisMenor = pais;
            }
        }
        return paisMenor;
    }
}