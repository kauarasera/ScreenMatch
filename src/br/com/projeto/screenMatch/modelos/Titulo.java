package br.com.projeto.screenMatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private double duracaoEmMinutos;
    private boolean incluidoNoPlano;
    private int somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    public void exibeFichaTecnica() {
        System.out.println("Nome : " + getNome());
        System.out.println("Ano de lançamento: " + getAnoDeLancamento());
        System.out.println("Duração total em minutos: " + getDuracaoEmMinutos() + "min");
        System.out.println("Incluido no plano: " + getIncluidoNoPlano());
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += (int) nota;
        totalDeAvaliacoes++;
    }

    public  double pegaMedia() {
        return (double) somaDasAvaliacoes / totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public double getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(double duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public boolean getIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public void setSomaDasAvaliacoes(int somaDasAvaliacoes) {
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

}
