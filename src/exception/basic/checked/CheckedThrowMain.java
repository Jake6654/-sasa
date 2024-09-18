package exception.basic.checked;

public class CheckedThrowMain {
    public static void main(String[] args) throws MyCheckedException {
        Service service = new Service();
        service.catchThrow(); // 예외가 메서드로 던져짐
        System.out.println("정상 종료");
    }
}
