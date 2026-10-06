package AulasJava.AulasJava.JavaCore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/gabriel");
        Path clazz = Paths.get("/home/gabriel/devdojo/OlaMundo.Java");
        Path dirTOclazz = dir.relativize(clazz);
        System.out.println(dirTOclazz);

        Path absoluto1 = Paths.get("/home/Gabriel");
        Path absoluto2 = Paths.get("/usr/local");
        Path absoluto3 = Paths.get("/home/gabriel/devdojo/OlaMundo.Java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/temp.2021546");

        System.out.println("1 " +absoluto1.relativize(absoluto3));
        System.out.println("2 " +absoluto3.relativize(absoluto1));
        System.out.println("3 " +absoluto1.relativize(absoluto2));
        System.out.println("4 " +relativo1.relativize(relativo2));
        System.out.println("5 " +absoluto1.relativize(relativo1));


    }
}
