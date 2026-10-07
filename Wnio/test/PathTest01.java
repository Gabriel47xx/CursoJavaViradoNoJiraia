package AulasJava.AulasJava.JavaCore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("file.txt");
        Path p2 = Paths.get("Bosta", "arquivo.txt");
        Path p3 = Paths.get("Bosta", "subpasta", "arquivo.txt");
        System.out.println(p1.getFileName());
        System.out.println(p2);
        System.out.println(p3);
    }
}
