package AulasJava.AulasJava.JavaCore.Ycolecoes.test;

import AulasJava.AulasJava.JavaCore.Ycolecoes.dominio.Manga;
import AulasJava.AulasJava.JavaCore.Ycolecoes.dominio.SmartPhone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class MangaPrecoComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga (5L, "Hellsing", 19.90, 0));
        mangas.add(new Manga(1L, "Berserk",9.5, 5));
        mangas.add(new Manga(4L,"Pokemon", 3.2,0));
        mangas.add(new Manga(3L, "Attack on Titan",11.20, 2));
        mangas.add(new Manga(2L,"Dragon Ball",2.99, 0));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        //lower <
        //floor <=
        //higher >
        //ceiling >=
        Manga Yuyu = new Manga(21L, "Yuyu", 3.2, 5);
        System.out.println("----------------------------");
        System.out.println(mangas.lower(Yuyu));
        System.out.println(mangas.floor(Yuyu));
        System.out.println(mangas.higher(Yuyu));
        System.out.println(mangas.ceiling(Yuyu));

        System.out.println("----------------------");

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.size());



    }
}
