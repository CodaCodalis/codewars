public class NoSpace {
    static String noSpace(final String str) {
        String string = str.replaceAll(" ", "");
        return string;
    }

    public static void main(String[] args) {
        String spaces = "Hello World !";
        System.out.println(spaces);
        System.out.println(noSpace(spaces));
    }
}
