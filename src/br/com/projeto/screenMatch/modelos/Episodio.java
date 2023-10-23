package br.com.projeto.screenMatch.modelos;

import br.com.projeto.screenMatch.calculos.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Series serie; //Referencia a seriea a qual Td episodio pertence
    private int totalViualizacoes;

    public int getTotalViualizacoes() {
        return totalViualizacoes;
    }

    public void setTotalViualizacoes(int totalViualizações) {
        this.totalViualizacoes = totalViualizações;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Series getSerie() {
        return serie;
    }

    public void setSerie(Series serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if (totalViualizacoes > 100) {
            return 4;  //regra de negocio Se tivermos mais de 100 visualizações, retornaremos quatro estrelas.
        } else {
            return 2;// Se não retorna 2 estrelas
        }
    }
}
