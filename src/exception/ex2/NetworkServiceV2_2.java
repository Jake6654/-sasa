package exception.ex2;



public class NetworkServiceV2_2 {
    // 복잡한 NetworkClient 사용 로직을 처리한다

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 clientV0 = new NetworkClientV2(address);
        clientV0.initError(data); // 추가 (data 안에 error 가 있는지 확인)

        try {
            clientV0.connect(); // 클라이언트에 접속
        } catch (NetworkClientExceptionV2 e){
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메세지: " + e.getMessage());
            return; // return 으로 메서드 종료
        }
        try{
            clientV0.send(data); // 메세지 전송
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() + ", 메세지: " + e.getMessage());
            return;
        }
        clientV0.disconnect(); // 접속 해제
    }

}
