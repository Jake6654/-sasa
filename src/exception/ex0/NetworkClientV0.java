package exception.ex0;

import exception.ex0.exception.ConnectException;
import exception.ex0.exception.SendException;

public class NetworkClientV0 {

    private final String address;
    private boolean connectError;
    private boolean sendError;

    public NetworkClientV0(String address) {
        this.address = address;
    }
    public void connect(){
        // 예외 처리 흐름
        if (connectError){
            throw new ConnectException("접속 오류",address);
        }
        // 연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data){
        if (sendError){
            throw new SendException("전송 오류",data);
        }
        //전송 성공
        System.out.println(address+ " 서버에 데이터 전송: " + data);
    }

    public void disconnect(){
        System.out.println(address + "서버 연결 해제");
    }

    public void initError(String data) {
        if (data.equals("error1")){
            connectError = true;
        } else if (data.equals("error2")) {
            sendError = true;
        }
    }
}

