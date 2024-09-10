package nested.nested1;

public class NestedOuter {
    // public 일 경우 다른 패키지 클래스에서도 className.variableName 을 통해 클래스 변수에 접근가능
    // 외부클래스는 중첩 클래스 멤버에 접근이 불가
    private static int outClassValue = 3;
    private int outInstanceValue = 2;



    static class Nested{
        private int nestInstanceValue = 1;


        public void print(){
            // 자신의 멤버의 접근
            System.out.println(nestInstanceValue);

            // 바깥 클래스의 인스턴스 멤버에 접근에는 접근할 수 없다.
            // System.out.println(outInstanceValue);

            // 바깥 클래스의 클래스 멤버에는 접근할 수 있다. (private 접근가능)
            // 내부 클래스도 말 그대로 클래스 내부에 있기 때문에 private 접근이 가능하다
            System.out.println(outClassValue);


        }
    }
}

