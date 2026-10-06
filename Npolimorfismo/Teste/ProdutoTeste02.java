package AulasJava.AulasJava.JavaCore.Npolimorfismo.Teste;

import AulasJava.AulasJava.JavaCore.Npolimorfismo.Dominio.Computador;
import AulasJava.AulasJava.JavaCore.Npolimorfismo.Dominio.Produto;
import AulasJava.AulasJava.JavaCore.Npolimorfismo.Dominio.Tomate;
import AulasJava.AulasJava.JavaCore.Npolimorfismo.Servico.CalculadoraImposto;

public class ProdutoTeste02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Rysen 9", 7000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());

        System.out.println("---------------------");

        Produto produto02= new Tomate("Americano", 20);
        System.out.println(produto02.getNome());
        System.out.println(produto02.getValor());
        System.out.println(produto02.calcularImposto());
        System.out.println("---------------------------------");

        Tomate tomate = new Tomate("Brazil", 50);
        CalculadoraImposto.calcularImposto(tomate);


    }
}
