package nested.anonymous.ex;

import java.util.Random;

public class Ex1Main2 {
    // 지역 클래스 사용
    public static void helloProgram(Process process) {
        System.out.println("Start program");
        process.run();
        System.out.println("end program");
    }


    public static void main(String[] args) {

        class Dice implements Process {
            @Override
            public void run() {
                int random = new Random().nextInt(6) + 1;
                System.out.println("randomValue = " + random);
            }
        }
        class Sum implements Process {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        }
        Process dice = new Dice();
        Process sum = new Sum();
        helloProgram(dice);
        helloProgram(sum);

    }
}
