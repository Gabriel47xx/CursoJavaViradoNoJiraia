package AulasJava.AulasJava.JavaCore.ZZClambdas.test;

import AulasJava.AulasJava.JavaCore.ZZClambdas.dominio.Anime;
import AulasJava.AulasJava.JavaCore.ZZClambdas.dominio.service.AnimeComparator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReferenceTest03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("Rimuru", "Veldora", "Hikimaru"));
        list.sort(String::compareTo);
        System.out.println(list);
        Function<String, Integer> numStringToInteger = Integer::parseInt;
        System.out.println(numStringToInteger.apply("10"));

        BiPredicate<List<String>, String> checkName = List::contains;
        System.out.println(checkName.test(list, "Rimuru"));


    }
}
