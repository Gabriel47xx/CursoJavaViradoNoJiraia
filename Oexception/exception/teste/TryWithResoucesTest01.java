package AulasJava.AulasJava.JavaCore.Oexception.exception.teste;

import AulasJava.AulasJava.JavaCore.Oexception.exception.dominio.Leitor01;
import AulasJava.AulasJava.JavaCore.Oexception.exception.dominio.Leitor02;

import java.io.*;

public class TryWithResoucesTest01 {
    public static void main(String[] args) {
        lerArquivo();

    }
    public static void lerArquivo() {
        try(Leitor01 leitor01 = new Leitor01();
            Leitor02 leitor02 = new Leitor02()){

        }catch (IOException e){

        }

    }


    public static void lerArquivo02(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("file.txt"));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
