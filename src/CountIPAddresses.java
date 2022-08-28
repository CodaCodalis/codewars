public class CountIPAddresses {
    public static void main(String[] args) {
        String one = "192.168.178.9";
        String two = "192.168.178.20";

        int[] arrOne = splitBySeparator(one);
        int[] arrTwo = splitBySeparator(two);
        
        String[] ipOneAsBinary = convertToBinary(arrOne);
        String[] ipTwoAsBinary = convertToBinary(arrTwo);
        
        //String resultAsBinary = subtractBinaries(ipTwoAsBinary, ipOneAsBinary);

        //int resultAsDecimal = convertToDecimal(resultAsBinary);
        //System.out.println(resultAsDecimal);
    }

    private static int convertToDecimal(String resultAsBinary) {
        int decimal = Integer.parseInt(resultAsBinary, 2);
        return decimal;
    }

    private static String subtractBinaries(String[] ipTwoAsBinaryArr, String[] ipOneAsBinaryArr) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < ipOneAsBinaryArr.length; i++) {
            sb1.append(ipOneAsBinaryArr[i]);
        }
        String ipOneAsBinary = sb1.toString();
        for (int i = 0; i < ipOneAsBinaryArr.length; i++) {
            sb2.append(ipOneAsBinaryArr[i]);
        }
        String ipTwoAsBinary = sb2.toString();
        int one = Integer.parseInt(ipOneAsBinary);
        int two = Integer.parseInt(ipTwoAsBinary);
        int sum = one + (~two + 1);
        return Integer.toBinaryString(sum);
    }

    private static String[] convertToBinary(int[] intArr) {
        String[] binaryIPStrArr = new String[4];
        String[] binaryOctStrArr = new String[8];
        String binaryOctStr = "";
        for (int i = 0; i <= 3; i++) {
            System.out.println("Dezimal: " + intArr[i]);
            binaryOctStr = "";
            int index = 0;
            boolean marker = false;
            while (intArr[i] > 0) {
                binaryOctStrArr[index] = String.valueOf(intArr[i] % 2);
                index++;
                intArr[i] = intArr[i] / 2;
                if (intArr[i] == 0 && index < 7) {
                    marker = true;
                    StringBuilder tooShortOcts = new StringBuilder();
                    String string = "";
                    index = index - 1;
                    for (int k = index; k >= 0; k--) {
                        tooShortOcts.append(binaryOctStrArr[k]);
                    }
                    string = tooShortOcts.toString();
                    while (index <= 7) {
                        string = "0" + string;
                        index++;
                    }
                    index = index + 1;
                    binaryIPStrArr[i] = string;
                    //System.out.println("Binary: " + i + ". Oktett: " + string+ "");
                }
            }
            if (!marker) {
                for (int j = index - 1; j >= 0; j--) {
                    binaryOctStr = binaryOctStr + binaryOctStrArr[j];
                }
                binaryIPStrArr[i] = binaryOctStr;
                //System.out.println("Binary: " + i + ". Oktett: " + binaryOctStr + "");
            }
        }
        System.out.print("IP as binary: ");
        for (int i = 0; i < binaryIPStrArr.length; i++) {
            System.out.print(binaryIPStrArr[i] + " ");
        }
        System.out.println();
        return binaryIPStrArr;
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
