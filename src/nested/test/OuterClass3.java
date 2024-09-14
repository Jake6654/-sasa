package nested.test;

public class OuterClass3 {
    public void myMethod(){
        class LocalClass{ // 지역 클래스 정의
            public void hello(){
                System.out.println("LocalClass.hello");
            }
        }
        LocalClass localClass = new LocalClass(); // 생성
        localClass.hello(); // 호출
    }
}
