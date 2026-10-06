package AulasJava.AulasJava.JavaCore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("Home/Gabriel");
        Path arq = Paths.get("dev/arquivo.txt");
        Path resolve = dir.resolve(arq);
        System.out.println(resolve);

    }
}
