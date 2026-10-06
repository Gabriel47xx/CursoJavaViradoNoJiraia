package AulasJava.AulasJava.JavaCore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // \d = todos os dígitos
        // \D = todos exeto os dígitos
        // \s = Todos os espaços em branco = \t, \n, \f, \r
        // \S = Todos os caracteres exceto os brancos
        // \w = a-z || A-Z, digitos, _ (Exclui caracteres especiais)
        // \W = Todos os caracteres especiais e espaços em branco
        // []

//        String regex = "[a-z A-C]";
        String regex = "0[xX][0-9a-fA-F]";
//        String texto = "abaaba";
        String texto2 = "12 0x 0X 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("Texto: "+ texto2);
        System.out.println("Indice:0123456789");
        System.out.println("Regex: "+ regex);
        System.out.println("Posições encontradas: ");
        while (matcher.find()){
            System.out.print(matcher.start()+ " " +matcher.group()+ "\n");
        }
        int numHexa = 0xFFABC;
        System.out.println(numHexa);
    }
}
