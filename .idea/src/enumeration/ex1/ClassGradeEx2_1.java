package enumeration.ex1;

public class ClassGradeEx2_1 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
        //ClassGrade classGrade = new ClassGrade(); // x009
        int result = discountService.discount(ClassGrade.BASIC,price);
        System.out.println("할인율 : " + result);
    }
}
