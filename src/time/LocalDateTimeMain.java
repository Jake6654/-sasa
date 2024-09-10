package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2016,8,16,8,10,1);
        System.out.println("현재 날짜시간 = " +nowDt);
        System.out.println("지정 날짜시간 = " +ofDt);

        // 날짜와 시간 분리 (LocalDateTime 라이브러리는 LocalDate 와 LocalTime 을 두다 따로 갖고있다)
        // 따라서 분리하여 나타낼수도있다
        LocalDate localDate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println("locaDate = " + localDate);
        System.out.println("locaTime =" +localTime);

        // 날자와 시간 합체(LocalDate, LocalTime)
        LocalDateTime localDateTime = LocalDateTime.of(localDate,localTime);
        System.out.println("localDateTime = " + localDateTime);

        // 비교
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이전인가?" + nowDt.isBefore(ofDt));
        System.out.println("현재 날짜시간이 지정 날짜시간보다 이후인가?" + nowDt.isAfter(ofDt));
        System.out.println("현재 날짜시간이 지정 날짜시간과 같은?" + nowDt.isEqual(ofDt));



    }
}
