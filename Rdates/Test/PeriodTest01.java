package AulasJava.AulasJava.JavaCore.Rdates.Test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        LocalDate daquidoisanos = LocalDate.now().plusYears(2).plusDays(7);
        Period p1 = Period.between(now, daquidoisanos);
        Period p2 = Period.ofDays(10);
        Period p3 = Period.ofWeeks(52);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

    }
}
