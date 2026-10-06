package AulasJava.AulasJava.JavaCore.ZZHpadroesDeProjeto.test;

import AulasJava.AulasJava.JavaCore.ZZHpadroesDeProjeto.dominio.AirCraft;
import AulasJava.AulasJava.JavaCore.ZZHpadroesDeProjeto.dominio.AircraftSingletonEager;

public class AircraftSingletonEagerTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");

    }
    private static void bookSeat(String seat){
        System.out.println(AircraftSingletonEager.getINSTANCE());
        AircraftSingletonEager airCraft = AircraftSingletonEager.getINSTANCE();
        System.out.println(airCraft.bookSeat(seat));
    }

}
