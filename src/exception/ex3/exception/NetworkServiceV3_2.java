package exception.ex3.exception;



public class NetworkServiceV3_2 {
    // 복잡한 NetworkClient 사용 로직을 처리한다

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV3 clientV0 = new NetworkClientV3(address);
        clientV0.initError(data);

        try {
            clientV0.connect();
            clientV0.send(data);
        }catch (ConnectExceptionV3 e) {  // 연결 오류 // 오류 처리는 세밀한 오류부터 광범위한 오류로 점차 커나가야한다
            System.out.println("[연결 오류] 주소: " + e.getAddress() + ", 메세지: " + e.getMessage());
        }catch (NetworkClientExceptionV3 e) {
            System.out.println("[네트워크 오류] 메세지: " +e.getMessage());
        } catch (Exception e) {
            System.out.println("[알수 없는 오류] 메세지:" +e.getMessage());
        }
        finally {
            clientV0.disconnect();
        }

    }

}
