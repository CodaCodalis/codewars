public class NoSpace {
    static String noSpace(final String str) {
        str.replaceAll("\\s+", "");
        return str;
    }
}
