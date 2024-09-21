package exception.ex2;



public class NetworkServiceV2_5 {
    // 복잡한 NetworkClient 사용 로직을 처리한다

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 clientV0 = new NetworkClientV2(address);
        clientV0.initError(data);

        // unchecked 예외가 발생하면 catch 에서 잡을 순 없어도 finally 로 넘어가
        // 연결을 해제하고 오류를 던진다
        try {
            clientV0.connect();
            clientV0.send(data); // throw new RuntimeException("ex");
        } catch (NetworkClientExceptionV2 e){
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메세지: " + e.getMessage());
        }finally {
            clientV0.disconnect();
        }

    }

}
