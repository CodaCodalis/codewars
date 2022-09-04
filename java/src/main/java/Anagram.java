import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String testString, String originalString) {
        // if test is an anagram of original
        char[] test1 = testString.toLowerCase().toCharArray();
        Arrays.sort(test1);
        char[] test2 = originalString.toLowerCase().toCharArray();
        Arrays.sort(test2);
        int c = Arrays.compare(test1, test2);
        return c == 0;
    }


    public static void main(String[] args) {
        String test = "foefet";
        String original = "toffee";
        System.out.println(isAnagram(test, original));
    }
}
