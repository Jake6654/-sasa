package nested.nested1;

public class NestedOuterMain {
    public static void main(String[] args) {
        NestedOuter nestedOuter = new NestedOuter();
        // NestedOuter class 내부의 Nested 객체 생성
        NestedOuter.Nested nested = new NestedOuter.Nested();
        nested.print();


        System.out.println("nestedClass = " + nested.getClass());

    }
}
