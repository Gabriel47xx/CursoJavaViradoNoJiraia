package AulasJava.AulasJava.JavaCore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("Bosta").toAbsolutePath();
        Path clazz = Paths.get("Bosta", "arquivo.txt").toAbsolutePath();
        Path dirTOclazz = dir.relativize(clazz);
        System.out.println(dirTOclazz);

        Path absolute1 = Paths.get("Bosta").toAbsolutePath();
        Path absolute2 = Paths.get("arquivopasta").toAbsolutePath();
        Path absolute3 = clazz;
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp", "temp.2021546");

        System.out.println("1 " +absolute1.relativize(absolute3));
        System.out.println("2 " +absolute3.relativize(absolute1));
        System.out.println("3 " +absolute1.relativize(absolute2));
        System.out.println("4 " +relativo1.relativize(relativo2));
        System.out.println("5 " +absolute1.relativize(absolute2));


    }
}
