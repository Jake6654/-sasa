package nested.anonymous.ex;

import java.util.Random;

public class Ex1Main {
    public static void helloDice(){
        System.out.println("Start program");

        // 코드 조각 시작
        int random = new Random().nextInt(6)+ 1;
        System.out.println("randomValue = " + random);
        // 코드 조각 종료

        System.out.println("program end");
    }

    public static void helloSum(){
        System.out.println("Start program");

        // 코드 조각 시작
        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
        }
        // 코드 조각 종료
        System.out.println("program end");
    }
    public static void main(String[] args) {
        helloDice();
        helloSum();
    }

}
