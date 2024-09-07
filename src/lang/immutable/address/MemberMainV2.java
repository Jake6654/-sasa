package lang.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("Seoul");

        MemberV2 memberA = new MemberV2("memberA",address);
        MemberV2 memberB = new MemberV2("memberB",address);

        // 회원A, 회원B의 처음 주소는 모두 서울
        System.out.println("memberA = "+ memberA);
        System.out.println("memberB = "+ memberB);

        // 회원B의 주소를 부산으로 변경해야함
        // memberB.getAddress().setValue("Busan") // 컴파일 오류
        // Address 만 불변해야하는거지 회원이 불변이 되서는 안된다.
        // 새로운 address instance 를 참조시킴으로써 주소 변경
        memberB.setAddress(new ImmutableAddress("Busan"));

        System.out.println("memberA = "+ memberA);
        System.out.println("memberB = "+ memberB);



    }
}
