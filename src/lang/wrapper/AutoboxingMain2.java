package lang.wrapper;

public class AutoboxingMain2 {
    public static void main(String[] args) {
        // primitive -> Wrapper
        int value = 7;
        Integer boxedValue = value; // 오토 박싱(Auto-boxing)

        // Wrapper -> Primitive
        int unboxedValue = boxedValue; // 오토 언박싱(Auto-unboxing)

        System.out.println("boexedValue = " + boxedValue);
        System.out.println("unboexedValue = " + unboxedValue);


    }
}
