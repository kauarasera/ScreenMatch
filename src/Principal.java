import br.com.projeto.screenMatch.calculos.CalculadoraDeTempo;
import br.com.projeto.screenMatch.calculos.FiltroRecomendacao;
import br.com.projeto.screenMatch.modelos.Episodio;
import br.com.projeto.screenMatch.modelos.Filme;
import br.com.projeto.screenMatch.modelos.Series;

public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme();
        System.out.println("====================================================");
        System.out.println("=====================FILME==========================");
        filme.setNome("A era do Gelo");
        filme.setAnoDeLancamento(2006);
        filme.setDuracaoEmMinutos(72.0);
        filme.setIncluidoNoPlano(true);

        filme.exibeFichaTecnica();

        filme.avalia(8);
        filme.avalia(9);
        filme.avalia(10);
        System.out.println("Total de avaliações: " + filme.getTotalDeAvaliacoes());

        Filme filme2 = new Filme();
        filme2.setNome("Harry Potter");
        filme2.setAnoDeLancamento(2002);
        filme2.setDuracaoEmMinutos(180);


        System.out.println("Média das avaliações " + filme.pegaMedia());

        System.out.println("====================================================");
        System.out.println("=====================SERIE==========================");

        Series serie = new Series();
        serie.setNome("The Big Bang Theory");
        serie.setAnoDeLancamento(2007);
        serie.setTemporadas(12);
        serie.setIncluidoNoPlano(true);
        serie.setEpisodiosPorTemporada(24);
        serie.setMinutosPorEpsodio(20);

        serie.exibeFichaTecnica();
        System.out.println("Quantidade de temporadas: " + serie.getTemporadas());
        System.out.println("Episódios por temporada: " + serie.getEpisodiosPorTemporada());
        System.out.println("Duração por EP: " + serie.getMinutosPorEpsodio());


        serie.avalia(10);
        serie.avalia(9.5);
        serie.avalia(8.5);
        serie.avalia(6.5);
        serie.avalia(7.5);
        System.out.println("Total de avaliações: " + serie.getTotalDeAvaliacoes());

        System.out.println("====================================================");
        System.out.println("===================CALCULADORA======================");
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme);
        calculadora.inclui(serie);
        System.out.println("Calculando o tempo total dos filmes: " + calculadora.getTempoTotal());

        System.out.println("====================================================");
        System.out.println("=================FILTRO RECOMENDAÇÃO================");
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme);

        System.out.println("====================================================");
        System.out.println("=====================EPISÓDIO=======================");
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalViualizacoes(400);
        //relacionando dois objetos, estamos fazendo uma referencia de um objeto para outro
        //Estamos dizendo: episódio a serie é xxx.
        filtro.filtra(episodio);
    }
}