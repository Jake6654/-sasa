package enumeration.test;

import java.util.Scanner;

public class AutuGradeMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN] : ");
        String input = sc.nextLine();
        // String -> AuthGrade(class type)
        AuthGrade grade = AuthGrade.valueOf(input.toUpperCase());
        grade.print();



    }
}
