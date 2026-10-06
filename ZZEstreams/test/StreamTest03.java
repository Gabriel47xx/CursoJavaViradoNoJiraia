package AulasJava.AulasJava.JavaCore.ZZEstreams.test;

import AulasJava.AulasJava.JavaCore.ZZEstreams.dominio.LigthNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
    private static List<LigthNovel> ligthNovels = new ArrayList<>(List.of(
            new LigthNovel("Tensei Shitarra", 8.99),
            new LigthNovel("Overlord", 3.99),
            new LigthNovel("Violet Evergarden", 5.99),
            new LigthNovel("No game no Life", 2.99),
            new LigthNovel("Fullmetal Alchemist", 5.99),
            new LigthNovel("Kumo desuga", 1.99),
            new LigthNovel("Kumo desuga", 1.99),
            new LigthNovel("Monogatari", 4.00)
    ));
    public static void main(String[] args) {
        Stream<LigthNovel> stream = ligthNovels.stream();
        ligthNovels.forEach(System.out::println);
        long count = stream.filter(ln -> ln.getPrice() <= 4).count();

        System.out.println(count);

    }
}
