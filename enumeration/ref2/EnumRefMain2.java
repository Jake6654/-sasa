package enumeration.ref2;



public class EnumRefMain2 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
        int result = discountService.discount(Grade.BASIC,price); // Grade.BASIC 이 객체 생성
        // 생성된 객체가 discount 메서드에 넘어감
        System.out.println("할인율 : " + result);
    }
}
