public class RemoveChars {
    public static String remove(String str) {
        str = str.substring(1, str.length() - 1);
        return str;
    }
    public static void main(String[] args) {
        String str = "abracadabra";
        System.out.println(remove(str));
    }
}
