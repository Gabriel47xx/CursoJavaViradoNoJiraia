package AulasJava.AulasJava.JavaCore.ZZHpadroesDeProjeto.test;

import AulasJava.AulasJava.JavaCore.ZZHpadroesDeProjeto.dominio.AirCraft;

public class AircraftTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");

    }
    private static void bookSeat(String seat){
        AirCraft airCraft = new AirCraft("666");
        System.out.println(airCraft.bookSeat(seat));
    }

}
