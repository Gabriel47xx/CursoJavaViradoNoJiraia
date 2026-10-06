package AulasJava.AulasJava.JavaCore.CsobrecargaMetodos.teste;

import AulasJava.AulasJava.JavaCore.AulasJava.AulasJava.JavaCore.SobrecargaMetodos.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
//        anime.setNome("Akudama Drive");
//        anime.setTipo("TV");
//        anime.setEpisodios(12);
        anime.init("Akudama Drive", "TV", 12, "Acao");

        anime.imprime();
    }
}
