package enumeration.ex1;

public class ClassGrade {
    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();

    private ClassGrade(){
        // private 생성자를 통해 외부에서 인스턴스를 생성하지 못하게 막았다

    }


}
