package nested.local;

public class LocalOuterV1 {
    private int outInstanceVar = 3;

    public void process(int paraVar){
        int localVal = 1; // 지역변수

        class LocalPrinter{
            int value  = 0;

            public void printData(){
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVal);
                System.out.println("paraVar = " + paraVar); // 파라미터도 지역변서에 해당된다
                System.out.println("outInstanceVar = " + outInstanceVar);
            }

        }
        LocalPrinter printer = new LocalPrinter(); // 지역 클래스 인스턴스 생성
        printer.printData(); // 메서드 사용
    }

    public static void main(String[] args) {
        LocalOuterV1 outer = new LocalOuterV1();
        outer.process(5);
    }
}


