package AulasJava.AulasJava.JavaCore.ZZHpadroesDeProjeto.test;

import AulasJava.AulasJava.JavaCore.ZZHpadroesDeProjeto.dominio.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person build = new Person.PersonBuilder()
                .firstName("Gabriel")
                .lastName("Rezende")
                .userName("Developer")
                .email("gabigol@gmail.com")
                .build();

        System.out.println(build);
    }


}
