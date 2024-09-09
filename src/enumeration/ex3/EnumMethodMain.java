package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {

        // 모든 Enum 반환
        Grade[] grade = Grade.values();
        System.out.println("values = " + Arrays.toString(grade));
        for (Grade grade1 : grade) {
            System.out.println(grade1);
        }
    }
}