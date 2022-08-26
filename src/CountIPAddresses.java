public class CountIPAddresses {
    public static void main(String[] args) {
        String one = "192.168.178.9";
        String two = "192.168.178.20";

        int[] arrOne = splitBySeparator(one);
        int[] arrTwo = splitBySeparator(two);
        
        String ipOneAsBinary = convertToBinary(arrOne);
        String ipTwoAsBinary = convertToBinary(arrTwo);
        
        //String resultAsBinary = subtractBinaries(ipTwoAsBinary, ipOneAsBinary);

        //int resultAsDecimal = convertToDecimal(resultAsBinary);
        //System.out.println(resultAsDecimal);
    }

    private static int convertToDecimal(String resultAsBinary) {
        int decimal = Integer.parseInt(resultAsBinary, 2);
        return decimal;
    }

    private static String subtractBinaries(String ipTwoAsBinary, String ipOneAsBinary) {
        int one = Integer.parseInt(ipOneAsBinary);
        int two = Integer.parseInt(ipTwoAsBinary);
        int sum = one + (~two + 1);
        return Integer.toBinaryString(sum);
    }

    private static String convertToBinary(int[] intArr) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i <= 3; i++) {
            int[] binary = new int[8];
            int index = 0;
            while (intArr[i] > 0) {
                binary[index++] = intArr[i] % 2;
                intArr[i] = intArr[i] / 2;
            }
            for (int j = index-1; j >= 0; j--) {
                sb.append(binary[j]);
            }
            /*
            String string = "";
            sb.toString();
            while (string.length() <= 8) {
                string = "0" + sb;
            }
             */
            System.out.println("Length: " + sb.toString().length());
            System.out.println("Binary: " + sb);
        }
        return sb.toString();
    }

    private static int[] splitBySeparator(String string) {
        String[] strArr = string.split("\\.");
        int[] intArr = new int[4];
        for (int i = 0; i <= intArr.length - 1; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        return intArr;
    }
    
    
}
