import java.util.Scanner;

public class DecToBin {

    public static void main(String[] args) {
        int decimal, tmp, start, end;
        String dual;

        Scanner sc = new Scanner(System.in);
        System.out.println("Startwert: ");
        start = sc.nextInt();
        System.out.println("Endwert: ");
        end =sc.nextInt();
        for(decimal = start; decimal <= end; decimal++)
        {
            tmp = decimal;
            dual = "";
            while (tmp > 0) {
                if (tmp % 2 == 0) {
                    dual = "0" + dual;
                } else {
                    dual = "1" + dual;
                }
                tmp = tmp / 2;
            }
            System.out.printf("Dezimal %d -> Dualzahl %s\n", decimal, dual);
        }
    }
}
