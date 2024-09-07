package lang.immutable.change;

public class ImmutableMain {
    public static void main(String[] args) {
        ImmutableObject obj1 = new ImmutableObject(10);
        ImmutableObject obj2 = obj1.add(20);

        // 계산 이후에도 기존값가 신규값 모두 확인 가능
        System.out.println("obj1 = " + obj1.getValue());
        System.out.println("obj2 = " + obj2.getValue());
    }
}
