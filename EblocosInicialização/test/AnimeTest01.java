package AulasJava.AulasJava.JavaCore.EblocosInicialização.test;

import AulasJava.AulasJava.JavaCore.EblocosInicialização.Domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");
        System.out.println(anime.getEpisodios());

    }
}
