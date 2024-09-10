package nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        // Inner 클래스의 인스턴스를 만드려면 InnerOuter 클래스의 참조값을 알아야한다
        // Inner 는 내부 클래스이기 때문에 Outter참조값. new Inner()을 사용
        InnerOuter.Inner inner = outer.new Inner();
        inner.print();

        System.out.println("inner class = " +inner.getClass());
    }
}
