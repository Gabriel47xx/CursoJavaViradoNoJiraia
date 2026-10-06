package AulasJava.AulasJava.JavaCore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DosFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("bosta/teste.txt");
        if (Files.notExists(path)) Files.createFile(path);

        Files.setAttribute(path,"dos:hidden", true);
        Files.setAttribute(path,"dos:readonly", true);


    }

}
