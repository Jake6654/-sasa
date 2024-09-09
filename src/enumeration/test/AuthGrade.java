package enumeration.test;

public enum AuthGrade {
    GUEST(1,"손님"),
    LOGIN(2,"로그인 회원"),
    ADMIN(3,"운영자");

    private final int level;
    private final String description;
    AuthGrade(int level, String description) {
        this.level = level;
        this.description = description;
    }
    public int getLevel() {
        return level;
    }

    public String getDescription() {
        return description;
    }
    public void print(){
        System.out.print("당신의 등급은 ");
        if (this.level == 1){
            System.out.println("손님 입니다");
            System.out.println("== 메뉴 목록==");
            System.out.println("- 메인 화면");
        } else if (this.level == 2) {
            System.out.println("로그인 회원");
            System.out.println("== 메뉴 목록==");
            System.out.println("- 메인 화면");
            System.out.println("- 이메일 관리 화면");
        } else if (this.level == 3) {
            System.out.println("관리자 입니다");
            System.out.println("== 메뉴 목록==");
            System.out.println("- 메인 화면");
            System.out.println("- 이메일 관리 화면");
            System.out.println("- 관리자 화면");

        }

    }
}
