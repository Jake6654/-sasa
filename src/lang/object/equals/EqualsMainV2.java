package lang.object.equals;

public class EqualsMainV2 {
    public static void main(String[] args) {
        UserV2 user1 = new UserV2("id-100");
        UserV2 user2 = new UserV2("id-100");
        // 동일성
        System.out.println("identity = " + (user1 == user2));

        // 메서드 오버라이딩을 통해 equal를 어떻게 사용할지 재정의 하였다
        System.out.println("equality = " + user1.equals(user2));
    }
}
