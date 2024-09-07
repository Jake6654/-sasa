package lang.immutable.address;

public class ImmutableAddress {
    private final String value;
    // final 이 없어도 value 값을 바끌 수 있는 방법이 없다

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }


    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
