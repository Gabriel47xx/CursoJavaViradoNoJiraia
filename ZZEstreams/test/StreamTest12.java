package AulasJava.AulasJava.JavaCore.ZZEstreams.test;

import AulasJava.AulasJava.JavaCore.ZZEstreams.dominio.Category;
import AulasJava.AulasJava.JavaCore.ZZEstreams.dominio.LigthNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
    private static List<LigthNovel> ligthNovels = new ArrayList<>(List.of(
            new LigthNovel("Tensei Shitarra", 8.99, Category.FANTASY),
            new LigthNovel("Overlord", 3.99, Category.FANTASY),
            new LigthNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LigthNovel("No game no Life", 2.99, Category.FANTASY),
            new LigthNovel("Fullmetal Alchemist", 5.99, Category.FANTASY),
            new LigthNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LigthNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LigthNovel("Monogatari", 4.00, Category.ROMANCE)
    ));

    public static void main(String[] args) {
        Map<Category, List<LigthNovel>> collect = ligthNovels.stream().collect(Collectors.groupingBy(LigthNovel::getCategory));
        System.out.println(collect);

    }
}
