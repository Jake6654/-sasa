package exception.ex2;



public class NetworkServiceV2_4 {
    // 복잡한 NetworkClient 사용 로직을 처리한다

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 clientV0 = new NetworkClientV2(address);
        clientV0.initError(data);

        // RuntimeException 은 catch 대상이 아님, 예외가 밖으로 던져짐
        try {
            clientV0.connect();
            clientV0.send(data); // throw new RuntimeException("ex");
        } catch (NetworkClientExceptionV2 e){
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메세지: " + e.getMessage());
            return;
        }
        clientV0.disconnect(); // 따라서 이 코드는 호출이 되지 않는다
    }

}
