public class Prime {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        } else if (num == 2) {
            return true;
        } else if (num % 2 == 0) {
            return false;
        } else {
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(3));
        System.out.println(isPrime(4));
    }
}
