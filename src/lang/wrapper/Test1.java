package lang.wrapper;

public class Test1 {
    public static void main(String[] args) {
        String s1 = "10";
        String s2 = "20";
        // 반환값을 전달해줘야 한다
        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);

        int sum = num1 + num2;
        System.out.println("s1 + s2= " + sum);


        // 소수인 문자열을 doble type으로 바꾸고 더하는법
        String[] array = {"1.5", "2.5", "3.0"};
        int sum2 = 0;
        for (String string : array) {
            double dNum = Double.parseDouble(string);
            sum2+= dNum;
        }
        System.out.println("sum = " + sum2);

    }

}
