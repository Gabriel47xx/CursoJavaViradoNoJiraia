package AulasJava.AulasJava.JavaCore.ZZEstreams.test;

import AulasJava.AulasJava.JavaCore.ZZEstreams.dominio.Category;
import AulasJava.AulasJava.JavaCore.ZZEstreams.dominio.LigthNovel;
import AulasJava.AulasJava.JavaCore.ZZEstreams.dominio.Promotion;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest13 {
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
        Map<Promotion, List<LigthNovel>> collect = ligthNovels.stream().collect(Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE));
        System.out.println(collect);
        //Map Category, Map Promotion

        Map<Category, Map<Promotion, List<LigthNovel>>> collect1 = ligthNovels.stream().collect(Collectors.groupingBy(LigthNovel::getCategory, Collectors.groupingBy(ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE)));
        System.out.println(collect1);

    }
}
