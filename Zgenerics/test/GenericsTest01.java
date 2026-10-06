package AulasJava.AulasJava.JavaCore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Midorya");

        for (String s : list) {
            System.out.println(s);
        }

    }
}
