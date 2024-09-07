package lang.string.immutable;

public class StringImmutable1 {
    public static void main(String[] args) {
        String str = "hello";
        String newStr = str.concat(" java");
        System.out.println("str = " + newStr);
    }
}
