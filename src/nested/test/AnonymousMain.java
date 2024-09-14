package nested.test;

public class AnonymousMain {
    public static void main(String[] args) {
        Interface anInterface = new Interface(){
            @Override
            public void hello() {
                System.out.println("Hello.hello");
            }
        };

        anInterface.hello();
    }
}
