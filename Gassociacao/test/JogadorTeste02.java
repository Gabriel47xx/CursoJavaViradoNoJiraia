package AulasJava.AulasJava.JavaCore.Gassociacao.test;

import AulasJava.AulasJava.JavaCore.Gassociacao.dominio.Jogador;
import AulasJava.AulasJava.JavaCore.Gassociacao.dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Pele");
        Time time = new Time("Brasil");

        jogador01.setTime(time);

        jogador01.imprime();


    }

}
