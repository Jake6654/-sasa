package nested.local;

public class LocalOuterV2 {
    private int outInstanceVar = 3;

    public void process(int paraVar){
        int localVal = 1; // 지역변수

        class LocalPrinter implements Printer{
            int value  = 0;
            // Printer 인터페이스를 상속 받았기 때문에 print() 메서드를 구현해야 한다
            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVal);
                System.out.println("paraVar = " + paraVar); // 파라미터도 지역변서에 해당된다
                System.out.println("outInstanceVar = " + outInstanceVar);

            }
        }
        LocalPrinter printer = new LocalPrinter(); // 지역 클래스 인스턴스 생성
        printer.print(); // 메서드 사용
    }

    public static void main(String[] args) {
        LocalOuterV2 outer = new LocalOuterV2();
        outer.process(5);
    }
}


