package AulasJava.AulasJava.JavaCore.Rdates.Test;

import java.time.LocalTime;

public class LocalTimeTeste01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(23, 32, 55);
        System.out.println(time);
        LocalTime timeNow = LocalTime.now();
        System.out.println(timeNow);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());

    }
}
