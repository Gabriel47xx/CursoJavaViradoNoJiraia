package AulasJava.AulasJava.JavaCore.BintroducaoMetodos.Teste;

import AulasJava.AulasJava.JavaCore.BintroducaoMetodos.Dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
//        pessoa.nome = "Jiraya";
//        pessoa.idade = 70;

        pessoa.setNome("GAbigol");
        pessoa.setIdade(6);


        pessoa.imprime();
    }
}
