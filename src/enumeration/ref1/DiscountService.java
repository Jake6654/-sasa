package enumeration.ref1;


public class DiscountService {
    public int discount(ClassGrade classGrade, int price){
        // classGrade contains 회원정보(BASIC...)
        // getDiscountPercent() 을통해 바로 할인율 갖고 오기
        return price * classGrade.getDiscountPercent() /100;

    }
}
