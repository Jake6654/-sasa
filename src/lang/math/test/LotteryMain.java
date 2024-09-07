package lang.math.test;

import java.util.Arrays;

public class LotteryMain {
    public static void main(String[] args) {
        LotteryGenerator generator = new LotteryGenerator();
        int[] lotteryNums = generator.generator();
        System.out.println("당첨 번호:" + Arrays.toString(lotteryNums));

    }
}
