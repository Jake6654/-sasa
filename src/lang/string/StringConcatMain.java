package lang.string;

public class StringConcatMain {
    public static void main(String[] args) {
        String a = "Hello"; // x001;
        String b = " Java"; // x002;

        //String result1 = x001.concat(x002); 참조값을 전달하기 때문에 concat은 작동하지만
        //String result2 = x001 + x002; 이러한 참조값끼리의 덧셈은 원래 작동하지 않는다

        String result1 = a.concat(b);
        String result2 = a + b;
    }
}
