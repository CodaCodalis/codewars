public class SortArrayOdd {
    public static int[] sortArray(int[] array) {
        int i = 0;
        while (i < array.length) {
            while (i < array.length && array[i] % 2 == 0) i++;
            int j = i + 1;
            while (j < array.length) {
                while (j < array.length && array[j] % 2 == 0) j++;
                if (j <array.length && array[i] % 2 != 0 && array[j] % 2 != 0 && array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                j++;
            }
            i++;
        }
        for (int k : array) {
            System.out.print(k + " ");
        }
        return array;
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 9, 6, 3, 4};
        sortArray(arr);
    }
}
