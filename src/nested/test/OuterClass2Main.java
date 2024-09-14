package nested.test;

public class OuterClass2Main {
    public static void main(String[] args) {
        OuterClass2 outerClass2 = new OuterClass2();
        // 내부 클래스의 메서드는 외부 클래스의 참조값을 알아야하기 때문에
        // 객체를 생성할때 바깥클래스.new 내부클래스() 로 한다
        OuterClass2.InnerClass inner = outerClass2.new InnerClass();
        inner.hello();
    }
}
