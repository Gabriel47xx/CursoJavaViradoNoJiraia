package AulasJava.AulasJava.JavaCore.ZZEstreams.test;

import AulasJava.AulasJava.JavaCore.ZZEstreams.dominio.LigthNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest06 {
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
        System.out.println(ligthNovels.stream().anyMatch(ln -> ln.getPrice() > 8));
        System.out.println(ligthNovels.stream().allMatch(ln -> ln.getPrice() > 0));
        System.out.println(ligthNovels.stream().noneMatch(ln -> ln.getPrice() > 0));
        ligthNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .findAny()
                .ifPresent(System.out::println);

    }

}
