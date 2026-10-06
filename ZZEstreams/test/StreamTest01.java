package AulasJava.AulasJava.JavaCore.ZZEstreams.test;

import AulasJava.AulasJava.JavaCore.ZZEstreams.dominio.LigthNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest01 {
    private static List<LigthNovel> ligthNovels = new ArrayList<>(List.of(
            new LigthNovel("Tensei Shitarra", 8.99),
            new LigthNovel("Overlord", 3.99),
            new LigthNovel("Violet Evergarden", 5.99),
            new LigthNovel("No game no Life", 2.99),
            new LigthNovel("Fullmetal Alchemist", 5.99),
            new LigthNovel("Kumo desuga", 1.99),
            new LigthNovel("Monogatari", 4.00)
    ));
    public static void main(String[] args) {
        ligthNovels.sort(Comparator.comparing(LigthNovel::getTitle));
        List<String> titles = new ArrayList<>();

        for (LigthNovel ligthNovel : ligthNovels) {
            if(ligthNovel.getPrice() <= 4){
                titles.add(ligthNovel.getTitle());
            }
            if (titles.size() >= 3){
                break;
            }

        }

        System.out.println(ligthNovels);
        System.out.println(titles);


    }
}
