package br.com.projeto.screenMatch.calculos;

public class FiltroRecomendacao {
    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Esta entre os proferidos do momento");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado no momento");
        } else {
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}
/*
Classe onde faz um filtro de recomendação, onde daremos "ok" somente no conteúdo que possui mais de quatro estrelas
Td mundo que prometeu ter um metodo get classificação vai ter essa regra do filtro de recomentações
*/