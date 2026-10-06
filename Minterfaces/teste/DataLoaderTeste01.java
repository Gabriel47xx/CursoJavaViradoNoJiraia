package AulasJava.AulasJava.JavaCore.Minterfaces.teste;

import AulasJava.AulasJava.JavaCore.Minterfaces.dominio.DataLoader;
import AulasJava.AulasJava.JavaCore.Minterfaces.dominio.DatabaseLoader;
import AulasJava.AulasJava.JavaCore.Minterfaces.dominio.FileLoader;

public class DataLoaderTeste01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        databaseLoader.retrieveMaxDataSize();


    }
}
