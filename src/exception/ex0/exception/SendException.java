package exception.ex0.exception;

public class SendException extends NetworkClientException {

    private String sendData;

    public SendException(String message, String sendData) {
        super(message);
        this.sendData = sendData;
    }

    public String getSendData() {
        return sendData;
    }
}
