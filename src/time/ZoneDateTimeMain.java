package time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeMain {
    public static void main(String[] args) {
        ZonedDateTime nowZdt = ZonedDateTime.now();
        System.out.println("nowZdt = " + nowZdt);

        LocalDateTime ldt1 = LocalDateTime.of(2030, 1, 1, 13, 30, 50);
        // localDateTime 을 사용하여 ZonedDateTime 만들기
        ZonedDateTime zonedDateTime = ZonedDateTime.of(ldt1, ZoneId.of("Asia/Seoul"));
        System.out.println("zdt1 = " + zonedDateTime);

        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(2030,1,1,13,30,50,30,ZoneId.of("Asia/Seoul"));
        System.out.println("zdt2 = " + zonedDateTime1 );

        // 타입좀 바꾸기
        ZonedDateTime utcZdt = zonedDateTime1.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println("utcZdt = " + utcZdt); //
    }
}
