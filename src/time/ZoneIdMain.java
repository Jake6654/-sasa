package time;
import java.time.ZoneId;
import java.util.Set;

public class ZoneIdMain {
    public static void main(String[] args) {

        for(String availableZoneId : ZoneId.getAvailableZoneIds()){
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println(zoneId+ " | " + zoneId.getRules());
        }
        ZoneId zoneId = ZoneId.systemDefault(); // 시스템이 사용하는 기본 ZoneId 를 반환한다
        System.out.println("ZoneId.systemDefault = " + zoneId);

        ZoneId seoulZoneId = ZoneId.of("Asia/Seoul"); // 원하는 타임존을 직접 재공해서 ZoneId 반환
        System.out.println("seoulZoneId = " + seoulZoneId);

    }
}
