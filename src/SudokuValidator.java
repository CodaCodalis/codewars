import java.util.ArrayList;
import java.util.Arrays;


public class SudokuValidator {
    public static void main(String[] args) {
        int[][] twoDeeIntArray = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };

        int[][] twoDeeIntArray2 = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 0, 3, 4, 8},
                {1, 0, 0, 3, 4, 2, 5, 6, 0},
                {8, 5, 9, 7, 6, 1, 0, 2, 0},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 0, 1, 5, 3, 7, 2, 1, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 0, 0, 4, 8, 1, 1, 7, 9}
        };

        if (!check(twoDeeIntArray2)) {
            System.out.println("Fehler irgendwo!");
        } else {
            System.out.println("Sudoku gelöst!");
        }

    }

    public static boolean check(int[][] twoDeeIntArray) {

        //alle horizontalen Linien durchgehen
        int counter = 0;
        while (counter <= 8) {
            ArrayList<String> twoDeeStringArrayListLine = new ArrayList<String>();
            for (int i = 0; i <= 8; i++) {
                String num = Integer.toString(twoDeeIntArray[counter][i]);
                twoDeeStringArrayListLine.add(num);
            }
            if (!checkOneToNineAndClear(twoDeeStringArrayListLine)) {
                return false;
            }
            counter++;
        }

        //alle vertikalen Linien durchgehen
        counter = 0;
        while (counter <= 8) {
            ArrayList<String> twoDeeStringArrayListLine = new ArrayList<String>();
            for (int i = 0; i <= 8; i++) {
                String num = Integer.toString(twoDeeIntArray[i][counter]);
                twoDeeStringArrayListLine.add(num);
            }
            if (!checkOneToNineAndClear(twoDeeStringArrayListLine)) {
                return false;
            }
            counter++;
        }

        //alle Quadrate durchgehen
        int square = 0;
        while(square <= 8) {
            if (!checkSquare(square, twoDeeIntArray)) {
                return false;
            }
            square++;
        }

        return true;
    }

    public static boolean checkSquare (int squareNum, int[][] twoDeeIntArray) {
        ArrayList<String> twoDeeStringArrayListSquare = new ArrayList<String>();
        int x1 = 0;
        int x2 = 2;
        int y1 = 0;
        int y2 = 2;
        if (squareNum == 1) {
            x1 = x1 + 3;
            x2 = x2 + 3;
        } else if (squareNum == 2) {
            x1 = x1 + 6;
            x2 = x2 + 6;
        } else if (squareNum == 3) {
            y1 = y1 + 3;
            y2 = y2 + 3;
        } else if (squareNum == 4) {
            y1 = y1 + 3;
            y2 = y2 + 3;
            x1 = x1 + 3;
            x2 = x2 + 3;
        } else if (squareNum == 5) {
            y1 = y1 + 3;
            y2 = y2 + 3;
            x1 = x1 + 6;
            x2 = x2 + 6;
        } else if (squareNum == 6) {
            y1 = y1 + 6;
            y2 = y2 + 6;
        } else if (squareNum == 7) {
            y1 = y1 + 6;
            y2 = y2 + 6;
            x1 = x1 + 3;
            x2 = x2 + 3;
        } else if (squareNum == 8) {
            y1 = y1 + 6;
            y2 = y2 + 6;
            x1 = x1 + 6;
            x2 = x2 + 6;
        }
        for (int i = x1; i <= x2; i++) {
            for (int j = y1; j <= y2; j++) {
                String num = Integer.toString(twoDeeIntArray[i][j]);
                twoDeeStringArrayListSquare.add(num);
            }
        }
        if (!checkOneToNineAndClear(twoDeeStringArrayListSquare)){
            return false;
        }
        return true;
    }

    public static boolean checkOneToNineAndClear(ArrayList<String> twoDeeStringArrayList) {
        for (int k = 1; k <= 9; k++) {
            String kString = Integer.toString(k);
            if (!twoDeeStringArrayList.contains(kString) || twoDeeStringArrayList.contains("0")) {
                return false;
            }
        }
        twoDeeStringArrayList.clear();
        return true;
    }
}
