package AulasJava.AulasJava.JavaCore.Qstring.test;

public class StringBuiderTeste01 {
    public static void main(String[] args) {
        String nome = "Gabriel";
        nome.concat("Rezende");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Gabriel Rezende");
        sb.append(" Fernandes").append(" Miranda");
        System.out.println(sb);
    }
}
