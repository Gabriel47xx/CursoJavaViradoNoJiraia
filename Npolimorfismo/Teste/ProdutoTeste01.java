package AulasJava.AulasJava.JavaCore.Npolimorfismo.Teste;

import AulasJava.AulasJava.JavaCore.Npolimorfismo.Dominio.Computador;
import AulasJava.AulasJava.JavaCore.Npolimorfismo.Dominio.Tomate;
import AulasJava.AulasJava.JavaCore.Npolimorfismo.Servico.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10", 11000);
        Tomate tomate = new Tomate("Tomate cereja", 10);
        tomate.setDataVal("12/05/25");

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("---------------------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("Data de Validade "+tomate.getDataVal());
    }
}
