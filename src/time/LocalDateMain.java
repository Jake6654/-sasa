package time;

import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();// 날짜(현재)
        LocalDate ofDate = LocalDate.of(2013,11,21); // 지정 날짜(특정 시간대)
        System.out.println("오늘 날짜 = "+ nowDate);
        System.out.println("지정 날짜 = " + ofDate);

        // 계산(불변): ofDate 는 불변이기 때문에 전달값을 받는 새로운 객체를 만들어야 한다
        LocalDate localDate = ofDate.plusDays(10);
        System.out.println("지정 날짜 + 10d = " + localDate );


    }
}
