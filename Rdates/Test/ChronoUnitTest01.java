package AulasJava.AulasJava.JavaCore.Rdates.Test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(2001, Month.MARCH, 16, 12, 52,16);
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Dias Vividos: " + ChronoUnit.DAYS.between(aniversario, now));
        System.out.println("Semanas Vividas: " + ChronoUnit.WEEKS.between(aniversario, now));
        System.out.println("Meses Vividos: " + ChronoUnit.MONTHS.between(aniversario, now));
        System.out.println("Anos Vividos: " + ChronoUnit.YEARS.between(aniversario, now));
    }
}
