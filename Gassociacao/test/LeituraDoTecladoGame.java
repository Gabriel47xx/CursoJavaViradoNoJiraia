package AulasJava.AulasJava.JavaCore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("O grande software de previsao do Futuro");
        System.out.println("Digite sua pergunta e eu responderei sim ou não");
        String pergunta = input.nextLine();
        if(pergunta.charAt(0) == ' '){
            System.out.println("sim");
        }else {
            System.out.println("Nao");
        }

    }
}
