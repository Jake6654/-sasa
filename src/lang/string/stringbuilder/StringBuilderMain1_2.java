package lang.string.stringbuilder;

public interface StringBuilderMain1_2 {
    public static void main(String[] args) {
        // 메서드 체이닝을 이용한 StringBuilder 사용하기
        StringBuilder sb = new StringBuilder();
        String stirng = sb.append("a").append("b").append("c").append("d")
                .insert(4,"Java")
                .reverse()
                .toString();
        System.out.println("String = " + sb);
    }
}
