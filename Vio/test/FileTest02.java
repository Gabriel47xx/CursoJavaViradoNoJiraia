package AulasJava.AulasJava.JavaCore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("arquivopasta");
        boolean isdiretorioCriado = fileDiretorio.mkdir();
        System.out.println(isdiretorioCriado);
        File fileArquivo = new File(fileDiretorio, "arquivo.txt");
        boolean isFileCreated = fileArquivo.createNewFile();
        System.out.println(isFileCreated);

        File fileRenamed = new File(fileDiretorio, "arquivo_renomeado.txt");
        boolean isRenamed = fileArquivo.renameTo(fileRenamed);
        System.out.println(isRenamed);


    }

}
