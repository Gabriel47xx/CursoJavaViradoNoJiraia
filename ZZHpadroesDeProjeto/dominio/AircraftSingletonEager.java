package AulasJava.AulasJava.JavaCore.ZZHpadroesDeProjeto.dominio;

import java.util.HashSet;
import java.util.Set;

public final class AircraftSingletonEager {
    private static AircraftSingletonEager INSTANCE = new AircraftSingletonEager("Airbong-787");
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;
    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public static AircraftSingletonEager getINSTANCE() {
        return INSTANCE;
    }

    private AircraftSingletonEager(String name) {
        this.name = name;
    }

    public boolean bookSeat(String seat){
        return availableSeats.remove(seat);
    }

}
