package AulasJava.AulasJava.JavaCore.ZZClambdas.test;

import AulasJava.AulasJava.JavaCore.ZZClambdas.dominio.Anime;
import AulasJava.AulasJava.JavaCore.ZZClambdas.dominio.service.AnimeComparator;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparator animeComparator = new AnimeComparator();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One Piece", 1150), new Anime("Naruto", 500)));
        animeList.sort(animeComparator::CompareByEpisodesNonStatic);
        System.out.println(animeList);

    }
}
