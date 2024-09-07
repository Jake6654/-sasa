package lang.wrapper;

public class Test2 {
    public static void main(String[] args) {
        String str ="100";
        // String -> Integer
        Integer i = Integer.valueOf(str);
        System.out.println("integer1: "+i);

        // Integer -> int
        int value = i.intValue();
        System.out.println("intValue: "+value);

        // int -> Integer
        Integer integer2 = Integer.valueOf(value);
        System.out.println("integer2: " +integer2);

    }
}
