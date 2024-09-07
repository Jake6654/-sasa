package lang.object;

public class Parent {
    // 부모가 없으면 묵시적으로 Object 클래스를 상속 받는다.

    public void parentMethod(){
        System.out.println("Parent.parentMethod");
    }
}
