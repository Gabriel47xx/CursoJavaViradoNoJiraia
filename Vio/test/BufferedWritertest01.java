package AulasJava.AulasJava.JavaCore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWritertest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("O DevDojo é top ");
            bw.newLine();
            bw.write("O Gabriel é um dos melhores progamadores do mundo !!!");
            bw.flush();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
