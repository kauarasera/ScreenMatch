package br.com.projeto.screenMatch.modelos;

public class Series extends Titulo {
    private int temporadas;
    private int episodiosPorTemporada;
    private boolean ativa;
    int minutosPorEpsodio;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public boolean getAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosPorEpsodio() {
        return minutosPorEpsodio;
    }

    public void setMinutosPorEpsodio(int minutosPorEpsodio) {
        this.minutosPorEpsodio = minutosPorEpsodio;
    }

    @Override
    public double getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpsodio;
    }

    @Override
    public void exibeFichaTecnica() {
        super.exibeFichaTecnica();
    }
}
