public class Smaller {
    public static int[] smaller(int[] unsorted) {
        int arrLen = unsorted.length;
        int[] arrSmall = new int[arrLen];
        arrSmall[arrLen - 1] = 0;
        int x = 1;
        int counter;
        for (int i = 0; i < arrLen; i++) {
            counter = 0;
            if (unsorted[i] == 0) {
                arrSmall[i] = 0;
            } else {
                for (int j = x; j < arrLen; j++) {
                    if (unsorted[i] > unsorted[j]) {
                        counter += 1;
                    }
                }
            }
            arrSmall[i] = counter;
            x += 1;
        }
        return arrSmall;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 0, 2};
        int[] arrSmall = smaller(arr);
        for (int i = 0; i < arrSmall.length; i++) {
            System.out.println(arrSmall[i]);
        }
    }
}
