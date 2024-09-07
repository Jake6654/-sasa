package lang.wrapper;

public class WrapperVsPrimitive {
    public static void main(String[] args) {
        // 기본적으로는 일반형을 사용하고 복잡한 연산을 해야 하는 경우
        // wrapper 클래스를 이용해 최적화 하기
        int iterations = 1_000_000_000; // 반복 횟수 설정, 10억
        long startTime, endTime;

        // 기본형
        long sumPrimitive = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i <iterations ; i++) {
            sumPrimitive +=i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumPrimitive);
        System.out.println("기본 자료형 long 실행 시간 : " + (endTime - startTime) +"ms");


        // 래퍼 클래스 Long 사용
        Long sumWrapper = 0L;
        startTime = System.currentTimeMillis();
        for (int i = 0; i <iterations ; i++) {
            sumWrapper +=i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumWrapper = " + sumWrapper);
        System.out.println("래퍼 클래스 Long 실행 시간 : " + (endTime - startTime) +"ms");

    }
}
