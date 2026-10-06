package AulasJava.AulasJava.JavaCore.Gassociacao.test;

import AulasJava.AulasJava.JavaCore.Gassociacao.dominio.Aluno;
import AulasJava.AulasJava.JavaCore.Gassociacao.dominio.Local;
import AulasJava.AulasJava.JavaCore.Gassociacao.dominio.Professor;
import AulasJava.AulasJava.JavaCore.Gassociacao.dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua das laranjeiras");
        Aluno aluno = new Aluno("Luffy", 17);
        Professor professor = new Professor("Barba Branca", "Pirata");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Onde achar One piece", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();

    }
}
