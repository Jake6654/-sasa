package nested.inner.ex2;


public class Car {
    private int chargeLevel;
    private String model;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        // Car 의 인스턴스를 생성할때 Engine의 인스턴스도 생성된다 따라서 자동으로 Car 인스턴스를 참조한다
        this.engine = new Engine();
    }

    public void start(){
        engine.start();
        System.out.println(model + " 시작 완료");
    }

    private class Engine {
        // 내부 클래스는 외부 클래스의 인스턴스에 접근할수 있음으로 car을 지워준다

        public void start(){
            System.out.println("충전 레벨 확인: " + chargeLevel);
            System.out.println(model+"의 엔진을 구동합니다. ");
        }

    }

}
