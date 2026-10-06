package AulasJava.AulasJava.JavaCore.Rdates.Test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        if (c.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingo é o primeiro dia da semana !!!");
        }
        System.out.println("Dia da semana " +c.get(Calendar.DAY_OF_WEEK));
        System.out.println("Dia do mes " +c.get(Calendar.DAY_OF_MONTH));
        System.out.println("Dia do ano " +c.get(Calendar.DAY_OF_YEAR));

        c.add(Calendar.DAY_OF_MONTH, 2);

        Date date = c.getTime();
        System.out.println(date);
    }
}
