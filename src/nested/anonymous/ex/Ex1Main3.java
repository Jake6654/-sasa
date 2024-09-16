package nested.anonymous.ex;

import java.util.Random;

public class Ex1Main3 {
    // 익명 클래스 사용
    public static void helloProgram(Process process) {
        System.out.println("Start program");
        process.run();
        System.out.println("end program");
    }


    public static void main(String[] args) {

        Process dice = new Process() { // 익명 클래스 생성후 참조 값을 dice 에 전달
            @Override
            public void run() {
                int random = new Random().nextInt(10);
                System.out.println("randomValue = " + random);
            }
        }; // 익명 클래스 바디 부분이 끝나면 ; 해주기

        Process sum = new Process() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        };
        helloProgram(dice);
        helloProgram(sum);

    }
}
