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


    }
}