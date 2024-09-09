package enumeration.ex3;



public class ClassGradeEx3_1 {
    public static void main(String[] args) {
        int price = 10000;
        DiscountService discountService = new DiscountService();
        //ClassGrade classGrade = new ClassGrade(); // x009
        int result = discountService.discount(Grade.BASIC,price);
        System.out.println("할인율 : " + result);
    }
}
