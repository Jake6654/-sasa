package exception.ex3.exception;



public class NetworkServiceV3_1 {
    // 복잡한 NetworkClient 사용 로직을 처리한다

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV3 clientV0 = new NetworkClientV3(address);
        clientV0.initError(data);

        try {
            clientV0.connect();
            clientV0.send(data);
        } catch (SendExceptionV3 e) { // Send error
            System.out.println("[전송 오류] 전송 데이터: " +e.getSendData() +", 메세지: " + e.getMessage());
        } catch (ConnectExceptionV3 e) { // Connect error
            System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메세지: " + e.getMessage());
        } finally {
            clientV0.disconnect();
        }

    }

}
