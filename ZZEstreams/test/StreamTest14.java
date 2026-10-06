package AulasJava.AulasJava.JavaCore.ZZEstreams.test;

import AulasJava.AulasJava.JavaCore.ZZEstreams.dominio.Category;
import AulasJava.AulasJava.JavaCore.ZZEstreams.dominio.LigthNovel;
import AulasJava.AulasJava.JavaCore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.groupingBy;

public class StreamTest14 {
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
        Map<Category, Long> collect = ligthNovels.stream().collect(groupingBy(LigthNovel::getCategory, Collectors.counting()));
        System.out.println(collect);
        System.out.println("-----------------------------------------------");
        Map<Category, Optional<LigthNovel>> collect1 = ligthNovels.stream().collect(groupingBy(LigthNovel::getCategory, Collectors.maxBy(Comparator.comparing(LigthNovel::getPrice))));
        System.out.println(collect1);
    }
}
