package AulasJava.AulasJava.JavaCore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("O GAbriel é foda, ele aprende tudoo.");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println("-----------------");

        Optional<String> nameOptional = Optional.ofNullable(findName("Gabriel"));
        String vazio = nameOptional.orElse("Vazio");
        System.out.println(vazio);
    }

    private static String findName(String name) {
        List<String> list = List.of("Gabriel", "Programador");
        int i = list.indexOf(name);
        if (i != 1) {
            return list.get(i);
        }
        return null;
    }
}
