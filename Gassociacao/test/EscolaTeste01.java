package AulasJava.AulasJava.JavaCore.Gassociacao.test;

import AulasJava.AulasJava.JavaCore.Gassociacao.dominio.Escola;
import AulasJava.AulasJava.JavaCore.Gassociacao.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Jiraya");
        Professor professor2 = new Professor("Kakashi");
        Professor[] professores = {professor, professor2};
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();




    }
}
