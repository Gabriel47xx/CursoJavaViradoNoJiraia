package AulasJava.AulasJava.JavaCore.Dconstrutores.Teste.teste;


import AulasJava.AulasJava.JavaCore.Dconstrutores.Dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Tokio Ghoul", "Shoow", 25, "Terror", "Toey");
//        anime.setNome("Akudama Drive");
//        anime.setTipo("TV");
//        anime.setEpisodios(12);
//        anime.init("Akudama Drive", "TV", 12, "Acao");

        anime.imprime();
    }
}
