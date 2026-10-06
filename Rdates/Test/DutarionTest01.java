package AulasJava.AulasJava.JavaCore.Rdates.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DutarionTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime daquidoisanos = LocalDateTime.now().plusYears(2);
        LocalTime timeNow = LocalTime.now();
        LocalTime timeMenos7hr = LocalTime.now().minusHours(7);

        Duration d1 = Duration.between(now, daquidoisanos);
        Duration d2 = Duration.between(timeNow, timeMenos7hr);
        Duration d3 = Duration.ofDays(20);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

    }
}
