package AulasJava.AulasJava.JavaCore.BintroducaoMetodos.Teste;

import AulasJava.AulasJava.JavaCore.BintroducaoMetodos.Dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divide(20, 0);
        System.out.println(result);
        System.out.println("----------------");
        calculadora.imprimeDivisao(86, 0);


    }

}
