package lang.wrapper;

public class MyIntegerMethodMain1 {
    public static void main(String[] args) {
        // 객체가 아닌 기본형 데이터를 wrapper 클래스를 통해
        // 객체형태로 만들어 다양한 기능(method) 을 사용할 수 있게 해준다
        MyInteger integer = new MyInteger(10);
        int i1 = integer.compareTo(5);
        int i2 = integer.compareTo(10);
        int i3 = integer.compareTo(20);
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
    }
}
