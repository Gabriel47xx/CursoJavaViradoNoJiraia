package AulasJava.AulasJava.JavaCore.Qstring.test;

public class StringTeste01 {
    public static void main(String[] args) {
        String nome = "Gabriel"; // String constant pool
        String nome2 = "Gabriel";
        nome = nome.concat(" Rezende");
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Gabriel");
        System.out.println(nome2 == nome3);

    }
}
