package AulasJava.AulasJava.JavaCore.BintroducaoMetodos.Teste;

import AulasJava.AulasJava.JavaCore.BintroducaoMetodos.Dominio.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome ="Midoria";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante01.imprimirEstudante();

    }
}
