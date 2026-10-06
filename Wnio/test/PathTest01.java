package AulasJava.AulasJava.JavaCore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("G:\\Outros computadores\\Meu computador (1)\\Documents\\Java Virado no Jiraya\\JavaJiraya\\AulasJava\\AulasJava\\JavaCore\\file.txt");
        Path p2 = Paths.get("G:\\Outros computadores\\Meu computador (1)\\Documents\\Java Virado no Jiraya\\JavaJiraya\\AulasJava\\AulasJava","JavaCore\\file.txt");
        Path p3 = Paths.get("G:\\Outros computadores\\Meu computador (1)\\Documents\\Java Virado no Jiraya\\JavaJiraya\\AulasJava\\AulasJava\\JavaCore\\file.txt");
        System.out.println(p1.getFileName());
    }
}
