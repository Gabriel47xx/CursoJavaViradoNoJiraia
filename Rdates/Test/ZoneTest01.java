package AulasJava.AulasJava.JavaCore.Rdates.Test;

import java.time.*;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId zoneTokyo = ZoneId.of("Asia/Tokyo");
        System.out.println(zoneTokyo);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        ZonedDateTime zonedDateTime = now.atZone(zoneTokyo);
        System.out.println(zonedDateTime);

        System.out.println("------------------------------------");
        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);
        System.out.println("-------------------------------------");
        ZonedDateTime zonedDateTime2 = nowInstant.atZone(zoneTokyo);
        System.out.println("Hora na asia "  +zonedDateTime2);
        System.out.println("ZoneOFSet-----------------------------");
        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);
        ZoneOffset offSetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offSetDateTimeManaus = now.atOffset(offSetManaus);
        System.out.println(offSetDateTimeManaus);


    }
}
