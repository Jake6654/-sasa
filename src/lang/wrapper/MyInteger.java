package lang.wrapper;

public class MyInteger {

    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int compareTo(int target) {
        if (value < target) {
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        // print할때 참조값이 아닌 value을 나타내기위해 오버라이딩
        return ""+ value;
        // String.valueOf(value) 을 써도 된다.
    }
}
