package lang.immutable.address;

public class RefMain1_3 {
    public static void main(String[] args) {
        Address a = new Address("Seoul");
        Address b= a;
        System.out.println("a = " +a);
        System.out.println("b = " +b);

        // 메인 메서드만 보게 된다면 왜 a address 가 바뀌는지 모를 수 있다
        // 복잡한 코드에서 이러한 side effect 가 많이 발생함
       change(b,"부산");
        System.out.println("a = " +a);
        System.out.println("b = " +b);

    }
    private static void change(Address address, String changeAddress){
        System.out.println("주소 값을 변경합니다 -> " + changeAddress);
        address.setValue(changeAddress);
    }
}
