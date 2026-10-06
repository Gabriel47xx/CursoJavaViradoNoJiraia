package AulasJava.AulasJava.JavaCore.Oexception.exception.dominio;

import java.io.FileNotFoundException;

public class Funcionário extends Pessoa{
    @Override
    public void salvar() throws LoginInvalidoException, FileNotFoundException{
        System.out.println("Salvando Funcionàrio...");

    }
}
