package AulasJava.AulasJava.JavaCore.Npolimorfismo.Servico;

import AulasJava.AulasJava.JavaCore.Npolimorfismo.Dominio.Computador;
import AulasJava.AulasJava.JavaCore.Npolimorfismo.Dominio.Produto;
import AulasJava.AulasJava.JavaCore.Npolimorfismo.Dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImposto(Produto produto){
        System.out.println("Produto: "+produto.getNome());
        System.out.println("Preço: "+produto.getValor());
        System.out.println("Relatorio de Imposto ");
        double imposto = produto.calcularImposto();
        System.out.println("Imposto a ser pago "+imposto);
        if(produto instanceof Tomate) {
            Tomate tomate = (Tomate) produto;
            System.out.println("Data de validade " + tomate.getDataVal());
        }
    }


}
