package nested.anonymous.ex;

public class Ex0Main {

    public static void helloJava(){
        System.out.println("start program"); // 변하지 않는 부분
        System.out.println("hello java"); // 변하는 부분
        System.out.println("end program"); // 변하지 않는 부분

    }
    public static void helloSpring(){
        System.out.println("start program"); // 변하지 않는 부분
        System.out.println("hello spring"); // 변하는 부분
        System.out.println("end program"); // 변하지 않는 부분
    }

    public static void helloProgram(String programName){
        System.out.println("start program");
        System.out.println("hello" + programName);
        System.out.println("end program" );
    }
    public static void main(String[] args) {
        helloJava();
        helloSpring();
    }
}
