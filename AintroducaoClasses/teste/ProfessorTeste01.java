package AulasJava.AulasJava.JavaCore.AintroducaoClasses.teste;

import AulasJava.AulasJava.JavaCore.AintroducaoClasses.Dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "MestreKami";
        professor.idade = 140;
        professor.sexo = 'M';

        System.out.println("Nome="+professor.nome+ " Idade=" +professor.idade+ " Sexo=" +professor.sexo);

    }
}
