package exception.ex4;



public class NetworkServiceV5 {
    // 복잡한 NetworkClient 사용 로직을 처리한다

    public void sendMessage(String data) {
        String address = "http://example.com";

        try(NetworkClientV5 clientV5 = new NetworkClientV5(address)) {
            // clientV5 은 try 구문 안에서만 사용 가능하다
            clientV5.initError(data); // 추가
            clientV5.connect();
            clientV5.send(data);
        }catch (Exception e){
            System.out.println("[예외 확인]: " + e.getMessage());
            throw  e;
        }
    }
}
