package enumeration.ref3;

public enum Grade {
    // enum class 의 생성자 호출 방감
    // 상수를 호출할때 바로 생성자도 호출할 수 있게 설정
    BASIC(10), GOLD(20),PLATINUM(25),  DIAMOND(30);
    private final int discountPercent;

    Grade(int discountPercent) { // 기존 클래스와 달린 public, private 같은 타입선언을 하지 않음
        this.discountPercent = discountPercent;
    }
    // 추가
    public int discount(int price){ // discount logic 을 enum 클래스 내부에 생성
        return price * discountPercent/ 100;
    }
}
