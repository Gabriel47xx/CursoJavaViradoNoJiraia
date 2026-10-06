package AulasJava.AulasJava.JavaCore.Zgenerics.test;

import AulasJava.AulasJava.JavaCore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        criarArrayComUmObjeo(new Barco("Going Merry"));

    }
    private static <T> void criarArrayComUmObjeo(T t){
        List<T> list = new ArrayList<>();
        list.add(t);
        System.out.println(list);

    }

}
