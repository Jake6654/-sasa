package exception.ex2;

import exception.ex1.NetworkClientV1;

public class NetworkClientExceptionV2 extends Exception {

    private String errorCode;

    public NetworkClientExceptionV2(String errorCode, String message) {
        super(message); // 에러 메세지 보관
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}

