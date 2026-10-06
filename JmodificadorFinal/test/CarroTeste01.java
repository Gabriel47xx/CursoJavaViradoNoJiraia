package AulasJava.AulasJava.JavaCore.JmodificadorFinal.test;

import AulasJava.AulasJava.JavaCore.JmodificadorFinal.domain.Carro;
import AulasJava.AulasJava.JavaCore.JmodificadorFinal.domain.Comprador;
import AulasJava.AulasJava.JavaCore.JmodificadorFinal.domain.Ferrari;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Comprador comprador2 = new Comprador();


        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro01.COMPRADOR);
        carro01.COMPRADOR.setNome("Kiko");
        System.out.println(carro01.COMPRADOR);

        Ferrari ferrari01 = new Ferrari();
        ferrari01.setNome("jubilweu");
        ferrari01.imprime();




    }
}
