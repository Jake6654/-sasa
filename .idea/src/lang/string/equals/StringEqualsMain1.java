package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello"); // x001
        String str2 = new String("hello"); // x002
        System.out.println("new String() == 비교" + (str1 == str2));
        System.out.println("new String() equals 비교: " + (str1.equals(str2)));

        String str3 = "hello"; // x003
        String str4 = "hello"; // x004
        // literal 은 new String()하지 않고 적은 것을 의미한다
        System.out.println("Literal == comparison: "+ (str3== str4));
        System.out.println("Literal equals comparison: " + (str3.equals(str4)));
    }

}
