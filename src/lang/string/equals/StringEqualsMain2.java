package lang.string.equals;

public class StringEqualsMain2 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("메서드 호출 비교1: " + isSame(str1,str2));

        String str3 = "hello";
        String str4 =  "hello";
        System.out.println("메서드 호출 비교2: " + isSame(str3,str4));

    }
    private static boolean isSame(String x, String y){
        // 개발자 입장에서 어떠한(new String(), Literal) String value 가 들어올지 모르기 때문에
        // 항상 문자열 비교는 equals 를 통해 비교하기
        return x.equals(y);
    }
}
