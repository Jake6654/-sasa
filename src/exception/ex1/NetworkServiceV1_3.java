package exception.ex1;

public class NetworkServiceV1_3 {
    // 에러 메세지는 뜨게 리팩토링을 했지만 결국 프로그램이 disconnect 되지않고
    // 계속 반복이 된다

    public void sendMessage(String data) {
        String address = "https://example.com";
        NetworkClientV1 client = new NetworkClientV1(address);
        client.initError(data); // 추가

        String connectResult = client.connect();
        if (isError(connectResult)) { // 오류를 쉽게 보여주는 코드( 또한 간결하게 줄일 수 있다)
            System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);
        } else {
            String sendResult = client.send(data);
            if (isError(sendResult)) {
                System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
            }
        }
        client.disconnect();
    }

    private static boolean isError(String connectResult) {
        return !connectResult.equals("success");
    }


}
