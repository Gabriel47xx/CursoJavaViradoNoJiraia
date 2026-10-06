package AulasJava.AulasJava.JavaCore.Zgenerics.test;

import AulasJava.AulasJava.JavaCore.Zgenerics.Service.CarroRentavelService;
import AulasJava.AulasJava.JavaCore.Zgenerics.dominio.Carro;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        Carro carro = carroRentavelService.buscarCarroDisponivel();
        System.out.println("Usando o carro...");
        carroRentavelService.retornarCarroAlugado(carro);
    }


}
