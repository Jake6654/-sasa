package exception.ex0;

import exception.ex0.exception.ConnectException;
import exception.ex0.exception.SendException;

import java.util.Scanner;

public class MainV0 { // main 에서 예외를 한번에 처리
    public static void main(String[] args) {
        NetworkServiceV0 serviceV0 = new NetworkServiceV0();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("전송할 문자: ");
            String input = sc.nextLine();
            if (input.equals("exit")) {
                break;
            }
            try {
                serviceV0.sendMessage(input);
                System.out.println();
            } catch (Exception e) {
                handleException(e);
            }
        }
        System.out.println("프로그램을 정상 종료합니다.");

    }
    // 공통 예외 처리
    private static void handleException(Exception e) {
        if (e instanceof ConnectException connectException) {
            System.out.println("[연결 오류 발생] 주소 : " + connectException.getAddress() + ", 오류 메세지 : " + connectException.getMessage());
        }
        if (e instanceof SendException sendException) {
            System.out.println("[전송 오류 발생] : 전송 데이터" + sendException.getSendData() + ", 오류 메세지: " + sendException.getMessage());
        } else {
            System.out.println("알 수 없는 오류 발생");
            e.printStackTrace(System.out);
        }
    }

}


