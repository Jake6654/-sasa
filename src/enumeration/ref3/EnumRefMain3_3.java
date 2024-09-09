package enumeration.ref3;

public class EnumRefMain3_3 { // 객체 지향의 요소 추가
    public static void main(String[] args) {
        int price = 10000;
        Grade[] grades = Grade.values(); // Enum class 의 모든 상수값을 가져옴
        //
        for (Grade grade : grades) {
            printDiscount(grade,price);
        }

    }
    private static void printDiscount(Grade grade, int price){
        System.out.println(grade.name() + "등급의 할인 금액: " + grade.discount(price));
    }
}
