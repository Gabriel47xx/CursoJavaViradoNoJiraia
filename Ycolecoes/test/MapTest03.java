package AulasJava.AulasJava.JavaCore.Ycolecoes.test;

import AulasJava.AulasJava.JavaCore.Ycolecoes.dominio.Consumidor;
import AulasJava.AulasJava.JavaCore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Wilian Suane");
        Consumidor consumidor2 = new Consumidor("Gabriel Programador");

        Manga manga1 = new Manga(5L, "Hellsing", 19.90);
        Manga manga2 = new Manga(1L, "Berserk",9.5);
        Manga manga3 = new Manga(3L, "Attack on Titan",11.20);
        Manga manga4 = new Manga(4L,"Pokemon", 3.2);
        Manga manga5 = new Manga(2L,"Dragon Ball",2.99);

        List<Manga> mangaConsum1List = List.of(manga1, manga2, manga3);
        List<Manga> mangaConsum2List = List.of(manga3, manga4);

        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();
        consumidorMangaMap.put(consumidor1, mangaConsum1List);
        consumidorMangaMap.put(consumidor2, mangaConsum2List);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()){
            System.out.println("-----------------");
            System.out.println(entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println(manga.getNome());
            }

        }




    }
}
