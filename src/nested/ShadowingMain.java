package nested;

public class ShadowingMain {

    public int value =1;

    class Inner{
        public int value =2;

        void go() {
            int value = 3;
            System.out.println("value = " +value);
            // inner class 의 멤버 변수에 접근
            System.out.println("this.value = " + this.value);
            // 바깥 클래스의 멤버 변수에 접근
            System.out.println("ShadowingMain.this.value = " + ShadowingMain.this.value);
        }
    }

    public static void main(String[] args) {
        ShadowingMain main = new ShadowingMain();
        Inner inner = main.new Inner();
        inner.go();
    }
}
