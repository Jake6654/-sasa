package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("Seoul");
        ImmutableAddress b= a; // 참조값 대입을 막을 수 있는 방법이 없다

        System.out.println("a = " +a);
        System.out.println("b = " +b);

        // b.setValue("Busan"); // b의 값을 부산으로 변경해야함
        // 불변 객체임으로 새로운 인스턴스를 만들어 대입
        b = new ImmutableAddress("Busan");
        System.out.println("a = " +a);
        System.out.println("b = " +b);

    }
}
