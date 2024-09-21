package exception.ex0.exception;

public class NetworkClientException extends RuntimeException{
    private String address;

    public NetworkClientException(String message) {
        super(message);
        this.address = address;
    }
}
