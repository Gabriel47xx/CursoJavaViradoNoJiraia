package AulasJava.AulasJava.JavaCore.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path pastaPath = Paths.get("Bosta");
        if(Files.notExists(pastaPath)) {
            Files.createDirectory(pastaPath);
        }
        Path subpasta = Paths.get("Bosta\\subpasta");
        if(Files.notExists(subpasta)) {
            Path subdirectory = Files.createDirectory(subpasta);
        }

        
    }

}
