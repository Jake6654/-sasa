package lang.wrapper;

public class AutoboxingMain1 {
    public static void main(String[] args) {
        // primitive -> Wrapper
        int value = 7;
        Integer boxedValue = Integer.valueOf(value);

        // Wrapper -> Primitive
        int unboxedValue = boxedValue.intValue();

        System.out.println("boexedValue = " + boxedValue);
        System.out.println("unboexedValue = " + unboxedValue);


    }
}
