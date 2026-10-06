package AulasJava.AulasJava.JavaCore.Npolimorfismo.Teste;

import AulasJava.AulasJava.JavaCore.Npolimorfismo.Dominio.Computador;
import AulasJava.AulasJava.JavaCore.Npolimorfismo.Dominio.Produto;
import AulasJava.AulasJava.JavaCore.Npolimorfismo.Dominio.Tomate;
import AulasJava.AulasJava.JavaCore.Npolimorfismo.Servico.CalculadoraImposto;

public class ProdutoTeste03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Rysen 9", 7000);


        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataVal("30/03/2025");
        CalculadoraImposto.calcularImposto(tomate);

        System.out.println("----------------------------");

        CalculadoraImposto.calcularImposto(produto);



    }
}
