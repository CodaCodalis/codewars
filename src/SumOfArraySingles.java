public class SumOfArraySingles {
    public static int repeats(int[] arr) {
        int arrSum = 0;
        int repSum = 0;
        int sinSum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            arrSum = arrSum + arr[i];
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[i] == arr[j]) {
                    repSum = repSum + (2 * arr[i]);
                }
            }
        }
        sinSum = arrSum - repSum;
        System.out.println(sinSum);
        return sinSum;

    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 5, 1, 3, 4};
        repeats(arr);
    }
}

