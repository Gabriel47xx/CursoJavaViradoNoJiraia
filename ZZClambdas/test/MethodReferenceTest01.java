package AulasJava.AulasJava.JavaCore.ZZClambdas.test;

import AulasJava.AulasJava.JavaCore.ZZClambdas.dominio.Anime;
import AulasJava.AulasJava.JavaCore.ZZClambdas.dominio.service.AnimeComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("Berserk", 43), new Anime("One Piece", 1150), new Anime("Naruto", 500)));
//        Collections.sort(animeList, (a1, a2) -> a1.getTitle().compareTo(a2.getTitle()));
//        Collections.sort(animeList, AnimeComparator::CompareByTitle);
        animeList.sort(AnimeComparator::CompareByTitle);
        System.out.println(animeList);
    }
}
