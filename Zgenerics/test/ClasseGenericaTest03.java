package AulasJava.AulasJava.JavaCore.Zgenerics.test;

import AulasJava.AulasJava.JavaCore.Zgenerics.Service.BarcoRentavelService;
import AulasJava.AulasJava.JavaCore.Zgenerics.Service.RentalService;
import AulasJava.AulasJava.JavaCore.Zgenerics.dominio.Barco;
import AulasJava.AulasJava.JavaCore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Mercedes")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));
        RentalService<Carro> rentalService = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalService.buscarObjetoDisponivel();
        System.out.println("--------------------------------");
        rentalService.retornarBarcoAlugado(carro);

    }


}
