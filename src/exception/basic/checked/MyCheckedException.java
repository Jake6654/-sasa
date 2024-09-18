package exception.basic.checked;


/**
 * Exception 을 상속받은 예외는 체크 예외가 된다
 */

public class MyCheckedException extends Exception { // Exception 을 상속받으면 체크 예외가 된다
    public MyCheckedException(String message) {
        super(message); // 생성자를 통해 오류 메세지를 보관하는 기능, getMessage() 을 통해 조회가능


    }
}
