package AulasJava.AulasJava.JavaCore.ZZHpadroesDeProjeto.test;

import AulasJava.AulasJava.JavaCore.ZZHpadroesDeProjeto.dominio.AircraftSingletonEnum;

public class AircraftSingletonEnumTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");

    }
    private static void bookSeat(String seat){
        System.out.println(AircraftSingletonEnum.INSTANCE.hashCode());
        AircraftSingletonEnum airCraft = AircraftSingletonEnum.INSTANCE;
        System.out.println(airCraft.bookSeat(seat));
    }
}
