package lang.string.stringbuilder;

public interface StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append("b");
        sb.append("c");
        sb.append("d");

        System.out.println("sb = " + sb);
        sb.insert(4,"java");
        System.out.println(sb);

        // delete index 4 to 8
        sb.delete(4,8);
        System.out.println("delete = " + sb);

        // reverse
        sb.reverse();
        System.out.println("reverse = " + sb);

        // StringBuilder -> String
        String string = sb.toString();
        System.out.println("String = " + sb);
    }
}
