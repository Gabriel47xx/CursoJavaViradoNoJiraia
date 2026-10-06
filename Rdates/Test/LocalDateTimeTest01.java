package AulasJava.AulasJava.JavaCore.Rdates.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.of(2034, Month.AUGUST, 25);
        LocalTime time = LocalTime.of(9, 45, 21);

        System.out.println(localDateTime);
    }
}
