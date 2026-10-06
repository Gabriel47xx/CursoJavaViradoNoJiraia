package AulasJava.AulasJava.JavaCore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d = todos os dígitos
        // \D = todos exeto os dígitos
        // \s = Todos os espaços em branco = \t, \n, \f, \r
        // \S = Todos os caracteres exceto os brancos
        // \w = a-z || A-Z, digitos, _ (Exclui caracteres especiais)
        // \W = Todos os caracteres especiais e espaços em branco
        // []
        // ? = zero ou uma
        // * = zero ou mais
        // + = uma ou mais
        // {n,m} = de n até m
        // () = agrupamento
        // | = ou
        // $ = fim da linha
        // . = caracter coringa = 1.3 = 123, 133, 1@3

        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto: "+ texto);
        System.out.println("Indice:0123456789");
        System.out.println("Regex: "+ regex);
        System.out.println("Posições encontradas: ");

        while (matcher.find()){
            System.out.print(matcher.start()+ " " +matcher.group()+ "\n");
        }
    }
}
