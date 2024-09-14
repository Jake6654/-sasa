package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {
    private int outInstanceVar = 3;

    public Printer process(int paraVar){
        int localVal = 1; // 지역변수는 스택 프레임이 종료되는 순간 함께 제거된다

        class LocalPrinter implements Printer{
            // 인스턴스를 생성하는 시점에서 이런식으로 사용하는 지역 변수를 캡쳐한다
            // int localVal =1;
            // int paraVar = ?;
            int value  = 0;
            // Printer 인터페이스를 상속 받았기 때문에 print() 메서드를 구현해야 한다
            @Override
            public void print() {
                System.out.println("value = " + value);

                // 인스턴스는 지역 변수보다 더 오래 살아남는다
                System.out.println("localVar= " + localVal);
                System.out.println("paraVar = " + paraVar); // 파라미터도 지역변서에 해당된다
                System.out.println("outInstanceVar = " + outInstanceVar);

            }
        }
        LocalPrinter printer = new LocalPrinter(); // 지역 클래스 인스턴스 생성
        // printer.print(); 를 여기서 실행하지 않고 Printer 인스턴스만 반환하다
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV3 outer = new LocalOuterV3();
        Printer printer = outer.process(2); // process 라는 메서드가 실행 된 후에 는 지역변수들의값이 사라진다
        // printer.print()를 나중에 실행한다. process()의 스택 프레임이 사라진 이후에 실행
        printer.print(); // 하지만 localVar 와 paraVar 의 값들이 출력이된다

        // 추가
        System.out.println("필드 확인");
        // printer 클래스의 필드를 배열의 형태로 입력받아 iter 로 출력
        Field[] declaredFields = printer.getClass().getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);

        }

    }
}


