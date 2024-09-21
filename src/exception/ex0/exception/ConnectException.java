package exception.ex0.exception;

public class ConnectException extends NetworkClientException{

    private String address;
    public ConnectException(String message, String address) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
