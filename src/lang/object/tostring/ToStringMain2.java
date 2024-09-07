package lang.object.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("Model Y");
        Dog dog1 = new Dog("멍멍이1",5);
        Dog dog2 = new Dog("멍멍이2",3);

        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString()); // toString 메서드를 오버라이딩하지 않음
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println();


        System.out.println("2. printLn 내부에서 toString 호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println();

        System.out.println("3. Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

        // 객체의 참조값을 나타낼수 있는 코드
        // 객체의 참조값(int) 을 16진수로 바꾸는 코드
        String refValue = Integer.toHexString(System.identityHashCode(dog1));
        System.out.println(refValue);

        String refValue2 = Integer.toHexString(System.identityHashCode(dog2));
        System.out.println(refValue2);


    }
}
