package exception.ex0;

public class NetworkServiceV0 {
    // 복잡한 NetworkClient 사용 로직을 처리한다

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV0 clientV0 = new NetworkClientV0(address);

        clientV0.connect(); // 클라이언트에 접속
        clientV0.send(data); // 메세지 전송
        clientV0.disconnect(); // 접속 해제
    }

}
