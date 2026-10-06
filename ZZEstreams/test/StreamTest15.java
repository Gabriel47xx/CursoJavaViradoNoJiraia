package AulasJava.AulasJava.JavaCore.ZZEstreams.test;

import AulasJava.AulasJava.JavaCore.ZZEstreams.dominio.Category;
import AulasJava.AulasJava.JavaCore.ZZEstreams.dominio.LigthNovel;
import AulasJava.AulasJava.JavaCore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;

public class StreamTest15 {
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
        Map<Category, DoubleSummaryStatistics> collect = ligthNovels.stream()
                .collect(groupingBy(LigthNovel::getCategory, Collectors.summarizingDouble(LigthNovel::getPrice)));
        System.out.println(collect);
        Map<Category, List<Promotion>> collect1 = ligthNovels.stream()
                .collect(groupingBy(LigthNovel::getCategory, mapping(StreamTest15::getPromotion, Collectors.toList())));
        System.out.println(collect1);

    }
    private static Promotion getPromotion(LigthNovel ln){
        return ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;
    }
}
