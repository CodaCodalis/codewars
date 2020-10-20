public class MatrixAddition {
    public static int[][] matrixAddition(int[][] a, int[][] b) {
        //int first[][] = a;
        //int second[][] = b;
        int sum[][] = new int[a.length][a.length];
        for (int c = 0; c < a.length; c++)
            for (int d = 0; d < b.length; d++)
                sum[c][d] = a[c][d] + b[c][d];
        return sum;
    }

    public static void main(String[] args) {
        int[][] a = {{2, 3, 1},
                     {3, 4, 2},
                     {2, 1, 1}};
        int[][] b = {{1, 3, 4},
                     {2, 1, 5},
                     {2, 1, 1}};
        matrixAddition(a, b);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.printf("%d\t",a[i][j]);
            }
        }

    }
}

