import java.util.ArrayList;
import java.util.List;

public class SecretDetective {
    public String recoverSecret(char[][] triplets) {
        List<Character> charList = new ArrayList<>();

        for(char[] triplet : triplets) {
            char ch1 = triplet[0];
            char ch2 = triplet[1];
            char ch3 = triplet[2];

            if(!charList.contains(ch1)) {
                charList.add(0, ch1);
            }

            if(!charList.contains(ch2)) {
                charList.add(charList.indexOf(ch1), ch2);
            }

            if (charList.contains(ch2) && charList.indexOf(ch2) < charList.indexOf(ch1)) {
                int index = charList.indexOf(ch2);
                charList.remove(index);
                charList.add(charList.indexOf(ch1) + 1, ch2);
            }

            if (!charList.contains(ch3)) {
                charList.add(charList.indexOf(ch2), ch3);
            }

            if (charList.contains(ch3) && charList.indexOf(ch3) < charList.indexOf(ch2)) {
                int index = charList.indexOf(ch3);
                charList.remove(index);
                charList.add(charList.indexOf(ch2) + 1, ch3);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character ch : charList) {
            sb.append(ch);
        }

        String result = sb.toString();

        return result;
    }
}