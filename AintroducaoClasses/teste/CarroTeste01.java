package AulasJava.AulasJava.JavaCore.AintroducaoClasses.teste;

import AulasJava.AulasJava.JavaCore.AintroducaoClasses.Dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.modelo = "Chevrolet";
        carro.ano = 2007;
        carro.nome = "Camaro";


        System.out.println(carro.modelo);
        System.out.println(carro.nome);
        System.out.println(carro.ano);


    }
}
