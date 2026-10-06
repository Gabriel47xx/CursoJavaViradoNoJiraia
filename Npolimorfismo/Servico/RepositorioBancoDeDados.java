package AulasJava.AulasJava.JavaCore.Npolimorfismo.Servico;

import AulasJava.AulasJava.JavaCore.Npolimorfismo.Repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {

    @java.lang.Override
    public void salvar() {
        System.out.println("Salvando no Banco de Dados...");

    }
}
