package AulasJava.AulasJava.JavaCore.Zgenerics.Service;

import AulasJava.AulasJava.JavaCore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    private List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Mercedes")));

    public Carro buscarCarroDisponivel(){
        System.out.println("Buscando Carro Disponivel...");
        Carro carro = carrosDisponiveis.remove(0);
        System.out.println("Alugando Carro "+ carro);
        System.out.println("Carros disponiveis :" +carrosDisponiveis);
        return carro;
    }

    public void retornarCarroAlugado(Carro carro){
        System.out.println("Devolvendo Carro "+ carro);
        carrosDisponiveis.add(carro);
        System.out.println("Carros disponiveis :" +carrosDisponiveis);
    }

}

