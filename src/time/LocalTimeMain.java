package time;
import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        LocalTime ofTime = LocalTime.of(9,10,30);

        System.out.println("now time = " + nowTime);
        System.out.println("specified time = " + ofTime);

        // 계산(불변)
        LocalTime offTimePlus = ofTime.plusSeconds(30);
        System.out.println("specified time + 30s =" + offTimePlus );

    }
}
