package lang.string.stringbuilder;

public class LoopStringBuilderMain {
    public static void main(String[] args) {
        long starTime = System.currentTimeMillis();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            result.append("Hello, Java ");
        }
        long endTime = System.currentTimeMillis();

        System.out.println("result = " + result);
        System.out.println("time = " +(endTime - starTime) +"ms");
    }
}

