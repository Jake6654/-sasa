package nested.anonymous.ex;

import java.util.Random;

public class Ex1Main3 {
    public static void main(String[] args) {
        helloMethod("Sum");
    }
    public static void helloMethod(String str){
        System.out.println("Start program");

        class Dice {
            public void HelloDice() {
                int random = new Random().nextInt(6) + 1;
                System.out.println("randomValue = " + random);
            }
        }
        class Sum{
            public void SumDice() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        }
        if (str.equals("Dice")){
            Dice dice = new Dice();
            dice.HelloDice();
        }else if (str.equals("Sum")){
            Sum sum = new Sum();
            sum.SumDice();
        }
        System.out.println("End program");
    }

}
