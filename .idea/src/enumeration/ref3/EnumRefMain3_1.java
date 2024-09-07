package enumeration.ref3;

public class EnumRefMain3_1 {
    public static void main(String[] args) {
        int price = 10000;
        // Grade 클래스를 통해 바로 할인 로직 수행 후 값 저장
        System.out.println("BASIC 등급 할인 가격 = " + Grade.BASIC.discount(price));
        System.out.println("GOLD 등급 할인 가격 = " + Grade.GOLD.discount(price));
        System.out.println("DIAMOND 등급 할인 가격 = " + Grade.DIAMOND.discount(price));
    }

}

