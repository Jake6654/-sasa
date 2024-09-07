package lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        //Random random = new Random();
        // seed 가 같으면 random 의 결과가 계속 같게 나온다
        Random random = new Random(1);

        int randomInt = random.nextInt();
        System.out.println("randomInt: " + randomInt);

        double randomDouble= random.nextDouble();// 0.0d - 1.0d
        System.out.println("randomDouble: " + randomDouble);

        // ture or false
        boolean randomBoolean = random.nextBoolean();
        System.out.println("random Boolean: " + randomBoolean);

        // 범위 조회
        int randomRange1 = random.nextInt(10);// 0 - 9 가지 출력
        System.out.println("0 - 9: " + randomRange1);
        int randomRange2 = random.nextInt(10) + 1;
        System.out.println("1 - 10: "+ randomRange2);

    }

}
