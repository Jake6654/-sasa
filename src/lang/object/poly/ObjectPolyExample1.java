package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object o){
        //o.sound(); // 컴파일 오류, Object는 sound() 가 없다
       //o.move();   // 컴파일 오류, Object는 move() 가 없다.

        // 그럼에도 불구하고 메서드를 사용하고 싶다면
        // 객체에 맞는 다운캐스팅 필요
        if (o instanceof Dog dog){ // 자동 다운 캐스팅을 해준다
            dog.sound();
        }else if(o instanceof Car car){
            car.move();
        }
        // 기본적인 방법
        if (o instanceof Dog){
           ((Dog) o).sound();
        } else if (o instanceof Car) {
            ((Car) o).move();
        }

    }
}
