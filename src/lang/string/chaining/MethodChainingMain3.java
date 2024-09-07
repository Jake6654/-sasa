package lang.string.chaining;

public class MethodChainingMain3 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        // 메서드가 체인처럼 연결되어 있기 때문에 메서드 체이닝이라고 불린다
        int result = adder.add(1).add(2).add(3).getValue();
        System.out.println("result = " + result);
    }
}
