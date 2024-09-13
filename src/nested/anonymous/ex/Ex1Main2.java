package nested.anonymous.ex;

import java.util.Random;

public class Ex1Main2 {
    public static void main(String[] args) {
        Process dice = new Dice(); // 부모는 자식을 담을 수 있다
        Process sum = new Sum();

        helloMethod(dice);
        helloMethod(sum);
    }


    public static void helloMethod(Process process) {
        // 파라미터를 부모 클래스로 설정함으로써 다형성을 활용
        System.out.println("Start program");
        //코드 조각 시작
        process.run();
        // 코드 조각 종료
        System.out.println("End program");
    }

    static class Dice implements Process {
        @Override
        public void run() {
            int rand = new Random().nextInt(10) + 1;
            System.out.println("주사위 = " + rand);

        }
    }

    static class Sum implements Process {
        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
            }
        }
    }
}
