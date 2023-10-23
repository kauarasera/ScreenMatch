package br.com.projeto.screenMatch.calculos;

import br.com.projeto.screenMatch.modelos.Titulo;

public class CalculadoraDeTempo {
    //Soma o tempo de tudo que irá incluir nos filmes e series que quero assistir, o tempo vai acumulando sempre queincluir um filme ou serie
    private  int tempoTotal;

    //Inclui filme ou serie que quero somar
    public void inclui(Titulo titulo) {
        this.tempoTotal += (int) titulo.getDuracaoEmMinutos();
    }

    public int getTempoTotal() {
        return tempoTotal;
    }
}
