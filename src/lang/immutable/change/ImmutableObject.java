package lang.immutable.change;

public class ImmutableObject {
    private final int value;

    public ImmutableObject(int value) {
        this.value = value;
    }

    public ImmutableObject add(int addValue){
        int result = value + addValue;
        // 자기자신(value)는 절대 바꾸지 않지만 새로운 객체를 통해 값을 반환
        return new ImmutableObject(result);
    }

    public int getValue() {
        return value;
    }


}
