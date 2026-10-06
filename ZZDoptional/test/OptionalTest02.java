package AulasJava.AulasJava.JavaCore.ZZDoptional.test;

import AulasJava.AulasJava.JavaCore.ZZDoptional.domain.Manga;
import AulasJava.AulasJava.JavaCore.ZZDoptional.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> bokuNoHero = MangaRepository.findByTitle("Boku no Hero");
        bokuNoHero.ifPresent(manga -> manga.setTitle("Boku no Hero 2"));
        System.out.println(bokuNoHero);

        Manga mangaById = MangaRepository.findById(2)
                .orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaById);

        Manga manga = MangaRepository.findByTitle("fdasf")
                .orElse(new Manga(3, "Drifters", 60));
        System.out.println(manga);


    }
}
