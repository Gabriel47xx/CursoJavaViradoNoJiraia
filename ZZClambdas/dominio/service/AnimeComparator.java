package AulasJava.AulasJava.JavaCore.ZZClambdas.dominio.service;

import AulasJava.AulasJava.JavaCore.ZZClambdas.dominio.Anime;

public class AnimeComparator {
    public static int CompareByTitle (Anime a1, Anime a2){
        return a1.getTitle().compareTo(a2.getTitle());
    }
    public int CompareByEpisodesNonStatic (Anime a1, Anime a2){
        return Integer.compare(a1.getEpisodes(), a1.getEpisodes());
    }
}
