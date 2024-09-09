package enumeration.ref3;

public class EnumRefMain3_2 { // 객체 지향의 요소 추가
    public static void main(String[] args) {
        int price = 10000;
        printDiscount(Grade.BASIC,price);
        printDiscount(Grade.GOLD,price);
        printDiscount(Grade.DIAMOND,price);

    }
    private static void printDiscount(Grade grade, int price){
        System.out.println(grade.name() + "등그의 할인 금액: " + grade.discount(price));
    }
}
