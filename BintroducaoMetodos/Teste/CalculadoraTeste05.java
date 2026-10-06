package AulasJava.AulasJava.JavaCore.BintroducaoMetodos.Teste;

import AulasJava.AulasJava.JavaCore.BintroducaoMetodos.Dominio.Calculadora;

public class CalculadoraTeste05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1,5,6,9,5,23,232 );
    }
}
