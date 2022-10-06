import java.math.BigInteger;

public class LargeFactorials {

    public static String fact(long n) {
        BigInteger num = factorial(n);
        return num + "";
    }

    public static BigInteger factorial(long n) {
        /*
        if (n <= 1)
            return 1;
        else
            return n * factorial(n - 1);
        */
        BigInteger fact = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
}
