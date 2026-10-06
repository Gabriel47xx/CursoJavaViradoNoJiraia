package AulasJava.AulasJava.JavaCore.Xserializacao.test;

import AulasJava.AulasJava.JavaCore.Xserializacao.dominio.Aluno;
import AulasJava.AulasJava.JavaCore.Xserializacao.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerialiazcaoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "Gabriel Rezende", "12341010");
        Turma turma = new Turma("Maratona Java");
        aluno.setTurma(turma);
        System.out.println(aluno);
        serializar(aluno);
        deserializar();

    }

    private static void serializar(Aluno aluno) {
        Path path = Paths.get("Bosta/aluno.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void deserializar() {
        Path path = Paths.get("Bosta/aluno.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            Aluno aluno = (Aluno) ois.readObject();
        } catch (IOException | ClassCastException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

