package AulasJava.AulasJava.JavaCore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList(16); //1.4
        List<String> nomes2 = new ArrayList(16);
        nomes.add("Gabriel");
        nomes.add("Programador");
        nomes.add("Fodao");
        nomes2.add("Rico");
        nomes2.add("Livre");

        nomes.addAll(nomes2);


        for(String nome : nomes){
            System.out.println(nome);
        }
        System.out.println("----------------");
        for (int i = 0; i < nomes.size(); i++){
            System.out.println(i + nomes.get(i));
        }



    }
}
