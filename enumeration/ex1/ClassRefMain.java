package enumeration.ex1;

public class ClassRefMain {
    public static void main(String[] args) {
        // getClass() 을 통해 클래스 정보를 얻어오기
        System.out.println("class BASIC = " +ClassGrade.BASIC.getClass());
        System.out.println("class GOLD = " +ClassGrade.GOLD.getClass());
        System.out.println("class DIAMOND = " +ClassGrade.DIAMOND.getClass());

        // 필드에서 만들어진 객체의 참조값 얻기
        System.out.println("ref BASIC = " + ClassGrade.BASIC);
        System.out.println("ref GOLD = " + ClassGrade.GOLD);
        System.out.println("ref DIAMOND = " + ClassGrade.DIAMOND);


    }
}
