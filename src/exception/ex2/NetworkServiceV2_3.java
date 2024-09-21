package exception.ex2;



public class NetworkServiceV2_3 {
    // 복잡한 NetworkClient 사용 로직을 처리한다

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 clientV0 = new NetworkClientV2(address);
        clientV0.initError(data);

        // 정상흐름과 예외처리를 완벽하게 분리하였다
        try { // 하나의 try 안에 정상흐름을 모두 담는다
            clientV0.connect();
            clientV0.send(data);
            clientV0.disconnect();
        } catch (NetworkClientExceptionV2 e){
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메세지: " + e.getMessage());
            return; // return 으로 메서드 종료
        }
    }

}
