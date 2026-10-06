package AulasJava.AulasJava.JavaCore.ZZAclassesInternas.test;

public class OuterClassesTest03 {
    private String name = "Gabriel Programmer";
    static class Nested{
        String lastname = "Fodao";
        void print(){
            System.out.println(new OuterClassesTest03().name + " "+ lastname);
        }

    }
    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();

    }
}
