package exception.basic.unchecked;

public class Client {
    public void call(){
        throw new MyUncheckedException("ex"); // 아무런 오류가 생기지 않는다
    }
}
