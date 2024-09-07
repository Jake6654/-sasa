package lang.immutable.address;

public class RefMain1_2 {
    public static void main(String[] args) {
        Address a = new Address("Seoul");
        Address b= new Address("Seoul");


        System.out.println("a = " +a);
        System.out.println("b = " +b);

        b.setValue("Busan"); // b의 값을 부산으로 변경해야함
        System.out.println("a = " +a);
        System.out.println("b = " +b);

    }
}
