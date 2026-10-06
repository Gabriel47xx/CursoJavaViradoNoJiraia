package AulasJava.AulasJava.JavaCore.Gassociacao.test;

import AulasJava.AulasJava.JavaCore.Gassociacao.dominio.Jogador;
import AulasJava.AulasJava.JavaCore.Gassociacao.dominio.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Cafu");
        Jogador jogador02 = new Jogador("Pele");

        Time time = new Time("Brasil");
        Time time2 = new Time("Flamengo");

        Time[] times = {time, time2};
        Jogador[] jogadores = {jogador01, jogador02};

        jogador01.setTime(time);
        jogador02.setTime(time2);


        time.setJogadores(jogadores);


        System.out.println("---Jogador---");
        jogador01.imprime();

        System.out.println("---Time---");
        time.imprime();
    }
}
