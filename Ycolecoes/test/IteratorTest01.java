package AulasJava.AulasJava.JavaCore.Ycolecoes.test;

import AulasJava.AulasJava.JavaCore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga (5L, "Hellsing", 19.90, 0));
        mangas.add(new Manga(1L, "Berserk",9.5, 5));
        mangas.add(new Manga(4L,"Pokemon", 3.2,0));
        mangas.add(new Manga(3L, "Attack on Titan",11.20, 2));
        mangas.add(new Manga(2L,"Dragon Ball",2.99, 0));

//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while (mangaIterator.hasNext()){
//            Manga manga = mangaIterator.next();
//            if(manga.getQuantidade() == 0){
//                mangaIterator.remove();
//            }
//        }

        mangas.removeIf(manga -> manga.getQuantidade() == 0);

        System.out.println(mangas);



    }

}
