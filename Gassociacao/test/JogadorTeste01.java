package AulasJava.AulasJava.JavaCore.Gassociacao.test;

import AulasJava.AulasJava.JavaCore.Gassociacao.dominio.Jogador;

public class JogadorTeste01 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Pele");
        Jogador jogador02 = new Jogador("Romario");
        Jogador jogador03 = new Jogador("Cafu");

        Jogador[] jogadores = new Jogador[]{jogador01, jogador02, jogador03};

        jogador01.imprime();
        for (Jogador jogador : jogadores) {
            jogador.imprime();
            
        }
         


    }
}
