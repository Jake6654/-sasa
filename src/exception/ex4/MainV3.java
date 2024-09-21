package exception.ex4;
import exception.ex4.exception.SendExceptionV4;

import java.util.Scanner;

public class MainV3 {
    public static void main(String[] args)  {
        NetworkServiceV5 serviceV0 = new NetworkServiceV5();

        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("전송할 문자: ");
            String input = sc.nextLine();
            if (input.equals("exit")){
                break;
            }
            try {
                serviceV0.sendMessage(input);
            }catch (Exception e){ // 메인 에서 올라오는 예외를 모두 잡을 것이라는 코드
                exceptionalHandler(e); // 예외에 대한 정보를 받음
            }
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");

    }

    // 공토 예외 처리
    private static void exceptionalHandler(Exception e) {
        // 공통 처라
        System.out.println("사용자 메세지 : 죄송합니다. 알 수 없는 문제가 발생했습니다.");
        System.out.println("==개발자용 디버깅 메세지==");
        e.printStackTrace(System.out); // 스택 트레이스 출력

        // 필요하면 예외 별로 별도의 추가 처리 가능
        if (e instanceof SendExceptionV4 sendExceptionV4){
            // Exception 은 모든 예외의 부모 클래스이기 때문에 다른 자식 클래스를 잡을 수 있다.
            // 따라서 참조값을 받은 e 가 SendExceptionV4 의 객체라면 자동으로 다운 캐스팅 해주는 문법
            System.out.println("[전송 오류] 전송 데이터: " + sendExceptionV4.getSendData());
        }

    }
}
