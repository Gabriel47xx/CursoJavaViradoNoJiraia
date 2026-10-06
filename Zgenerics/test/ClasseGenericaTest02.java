package AulasJava.AulasJava.JavaCore.Zgenerics.test;

import AulasJava.AulasJava.JavaCore.Zgenerics.Service.BarcoRentavelService;
import AulasJava.AulasJava.JavaCore.Zgenerics.Service.CarroRentavelService;
import AulasJava.AulasJava.JavaCore.Zgenerics.dominio.Barco;
import AulasJava.AulasJava.JavaCore.Zgenerics.dominio.Carro;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();
        Barco barco = barcoRentavelService.buscarBarcoDisponivel();
        System.out.println("Usando o barco...");
        barcoRentavelService.retornarBarcoAlugado(barco);
    }


}
