package exception.basic.checked;

public class Service {
    Client client = new Client();

    /**
     * 예외를 잡아서 처리하는 코드
     */
    public void callCatch(){
        // call 에서 터트린 예외를 call 에서 throws 해서 나를 호출한 이 메서드로 예외가 전달된다

        try {
            client.call(); // 폭탄: 예외 발생
            // Exception = MyCheckedException 부모는 자식을 담을 수 있다
        } catch (MyCheckedException e){
            // 예외 처리 로직
            System.out.println("예외 처리, message= " + e.getMessage());
        }
        // 예외 처리가 완료되면 코드가 정상흐름으로 변경된다
        System.out.println("정상 흐름");
    }

    /**
     * 체크 예외를 밖으로 던지는 코드
     * 체크 예외는 예외를 잡지 않고 밖으로 던지려면 throws 예외를 메서드에 필수로 선언해야 한다.
     */
    public void catchThrow() throws MyCheckedException{
        client.call();
    }

}
