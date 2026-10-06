package AulasJava.AulasJava.JavaCore.Npolimorfismo.Teste;

import AulasJava.AulasJava.JavaCore.Npolimorfismo.Repositorio.Repositorio;
import AulasJava.AulasJava.JavaCore.Npolimorfismo.Servico.RepositorioArquivo;
import AulasJava.AulasJava.JavaCore.Npolimorfismo.Servico.RepositorioMemoria;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();
    }
}
