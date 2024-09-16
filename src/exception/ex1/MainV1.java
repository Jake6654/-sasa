package exception.ex1;



import java.util.Scanner;

public class MainV1 {
    public static void main(String[] args) {
        NetworkServiceV1_1 serviceV0 = new NetworkServiceV1_1();

        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("전송할 문자: ");
            String input = sc.nextLine();
            if (input.equals("exit")){
                break;
            }
            serviceV0.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");

    }
}
