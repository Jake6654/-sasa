package enumeration.ex3;

public class EumRefMain {
    public static void main(String[] args) {
        System.out.println("class BASIC =" + Grade.BASIC.getClass());
        System.out.println("class GOLD =" + Grade.GOLD.getClass());
        System.out.println("class DIAMOND =" + Grade.DIAMOND.getClass());

        // Enum 클래스는 toString 을 오버라이드에서 정의해둔 상수값을 바로 출력해준다
        System.out.println("ref BASIC =" + refValue(Grade.BASIC));
        System.out.println("ref GOLD =" + refValue(Grade.GOLD));
        System.out.println("ref DIAMOND =" + refValue(Grade.DIAMOND));





    }
    // 참조값을 반환해주는 메서드
    private static String refValue(Object object){
        return Integer.toHexString(System.identityHashCode(object));
    }
}
