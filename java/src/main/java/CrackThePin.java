import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class CrackThePin {

    public static void main(String[] args) {
        String hashToPin = hashInput("Hash eingeben: ");
        crack(hashToPin);
        System.out.println(crack(hashToPin));
    }
    public static String hashInput (String text) {
        String hash;
        Scanner keyboard = new Scanner(System.in);
        System.out.print(text);
        hash = keyboard.next();
        return hash;
    }

    public static String crack(String hash) {
        for (int i = 0; i < 100000; i++) {
            int k = Integer.toString(i).length();
            if (k == 1) {
                String pin = "0000" + i;
                if (hash.equals(getMd5(pin))) {
                    return pin;
                }
            }
            if (k == 2) {
                String pin = "000" + i;
                if (hash.equals(getMd5(pin))) {
                    return pin;
                }
            }
            if (k == 3) {
                String pin = "00" + i;
                if (hash.equals(getMd5(pin))) {
                    return pin;
                }
            }
            if (k == 4) {
                String pin = "0" + i;
                if (hash.equals(getMd5(pin))) {
                    return pin;
                }
            }
            if (k == 5) {
                String pin = "" + i;
                if (hash.equals(getMd5(pin))) {
                    return pin;
                }
            }

        }
        return null;
    }

    public static String getMd5(String input)
    {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        }
        catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}