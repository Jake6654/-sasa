package enumeration.test;

public class AutuMain {
    public static void main(String[] args) {
        // 모든 파이널 값을 Array 에 저장
      AuthGrade[] grades = AuthGrade.values();
        for (AuthGrade grade : grades) {
            System.out.println("grade= " + grade.name() + ", level = " + grade.getLevel() + ", 설명 = " + grade.getDescription() );
        }
    }
}
