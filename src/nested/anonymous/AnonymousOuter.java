package nested.anonymous;

import nested.local.Printer;

public class AnonymousOuter {
    private int outInstanceVar = 3;

    public void process(int paraVar) {

        int localVal = 1;// 지역변수

        Printer printer = new Printer() { // Printer 라는 인터페이스를 바로 구현한 익명 클래스이다
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVal);
                System.out.println("paraVar = " + paraVar); // 파라미터도 지역변서에 해당된다
                System.out.println("outInstanceVar = " + outInstanceVar);

            }
        };

        printer.print();
        System.out.println("printer.class = " + printer.getClass());
    }


    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2);

    }
}



