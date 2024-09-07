package lang.math.test;

import java.util.Random;

public class LotteryGenerator {

    private final Random random = new Random();
    private int[] lotteryNumbers;
    private int count;


    public int[] generator() {
        lotteryNumbers = new int[6];
        count = 0; // 배열의 element 을 순서 조건의 맞게 대입하기 위한 코드

        while (count < 6) {
            // 1- 45 까지의 숫자 생성
            int number = random.nextInt(45) + 1;
            // 중복되지 않는경우에만 값을 배열에 추가
            if (isUnique(number)) {
                lotteryNumbers[count] = number;
                count++;
            }
        }
        return lotteryNumbers;
    }


    private boolean isUnique(int num) { // 중복을 확인(기능)을 위한 코드
        for (int i = 0; i < lotteryNumbers.length; i++) {
            if (lotteryNumbers[i] == num) {
                return false;
            }
        }
        return true;
    }
}
