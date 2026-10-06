package AulasJava.AulasJava.JavaCore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = todos os dígitos
        // \D = todos exeto os dígitos
        // \s = Todos os espaços em branco = \t, \n, \f, \r
        // \S = Todos os caracteres exceto os brancos
        // \w = a-z || A-Z, digitos, _ (Exclui caracteres especiais)
        // \W = Todos os caracteres especiais e espaços em branco

        String regex = "\\W";
//        String texto = "abaaba";
        String texto2 = "fsf!@sd_6f1 ds6f\t16s1df";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("Texto: "+ texto2);
        System.out.println("Indice:0123456789");
        System.out.println("Regex: "+ regex);
        System.out.println("Posições encontradas: ");
        while (matcher.find()){
            System.out.print(matcher.start()+ " " +matcher.group()+ "\n");
        }
    }
}
