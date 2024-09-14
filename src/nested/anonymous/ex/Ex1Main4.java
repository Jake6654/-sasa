package nested.anonymous.ex;

import java.util.Random;

public class Ex1Main4 {
    // 익명 클래스 참조 바로 전달
    public static void helloProgram(Process process) {
        System.out.println("Start program");
        process.run();
        System.out.println("end program");
    }


    public static void main(String[] args) {

        helloProgram(new Process() { // 이런식으로 익명 클래스의 참조값을 바로 메서드에 전달함으로써
            // 코드 조각을 넘길 수 있는 방법이 생겼다
            // 익명 클래스는 간단한 구현을 제공할때 유용하다

            @Override
            public void run() {
                int random = new Random().nextInt(6) + 1;
                System.out.println("randomValue = " + random);
            }
        });
       helloProgram(new Process() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        });
    }
}
