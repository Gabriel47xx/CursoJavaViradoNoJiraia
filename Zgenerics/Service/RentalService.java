package AulasJava.AulasJava.JavaCore.Zgenerics.Service;

import AulasJava.AulasJava.JavaCore.Zgenerics.dominio.Barco;

import java.util.List;

public class RentalService<T> {
    private List<T> objetosDisponiveis;
    public RentalService (List<T> objetosDisponiveis){
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T buscarObjetoDisponivel(){
        System.out.println("Buscando Objeto Disponivel...");
        T t = objetosDisponiveis.remove(0);
        System.out.println("Alugando Objeto "+ t);
        System.out.println("Objeto disponiveis :" + objetosDisponiveis);
        return t;
    }

    public void retornarBarcoAlugado(T t){
        System.out.println("Devolvendo Objeto "+ t);
        objetosDisponiveis.add(t);
        System.out.println("Objeto disponiveis :" + objetosDisponiveis);
    }

}
