package AulasJava.AulasJava.JavaCore.Npolimorfismo.Servico;

import AulasJava.AulasJava.JavaCore.Npolimorfismo.Repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {


    @java.lang.Override
    public void salvar() {
        System.out.println("Salvando em um arquivo...");

    }
}
