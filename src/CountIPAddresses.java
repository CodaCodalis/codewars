public class CountIPAddresses {
    public static void main(String[] args) {
        String firstIP = "20.0.0.10";
        String secondIP = "20.0.1.0";

        int[] firstIPArr = splitBySeparator(firstIP);
        int[] secondIPArr = splitBySeparator(secondIP);
        
        String[] firstIPAsBinary = convertToBinary(firstIPArr);
        String[] secondIPAsBinary = convertToBinary(secondIPArr);

        String resultFourthAsBinary = subtractBinaries(secondIPAsBinary[3], firstIPAsBinary[3]);
        String resultThirdAsBinary = subtractBinaries(secondIPAsBinary[2], firstIPAsBinary[2]);
        String resultSecondAsBinary = subtractBinaries(secondIPAsBinary[1], firstIPAsBinary[1]);
        String resultFirstAsBinary = subtractBinaries(secondIPAsBinary[0], firstIPAsBinary[0]);

        boolean marker1 = false;
        boolean marker2 = false;
        boolean marker3 = false;

        if (resultFourthAsBinary.length() == 9) {
            marker1 = true;
            resultFourthAsBinary = resultFourthAsBinary.replace("-", "");
        }

        if (resultThirdAsBinary.length() == 9) {
            marker2 = true;
            resultThirdAsBinary = resultThirdAsBinary.replace("-", "");
        }

        if (resultSecondAsBinary.length() == 9) {
            marker3 = true;
            resultSecondAsBinary = resultSecondAsBinary.replace("-", "");
        }

        int resultFourthAsDecimal = convertToDecimal(resultFourthAsBinary);
        int resultThirdAsDecimal = convertToDecimal(resultThirdAsBinary);
        int resultSecondAsDecimal = convertToDecimal(resultSecondAsBinary);
        int resultFirstAsDecimal = convertToDecimal(resultFirstAsBinary);

        double result = resultFirstAsDecimal * Math.pow(256, 3)
                + resultSecondAsDecimal * Math.pow(256, 2)
                + resultThirdAsDecimal * 256
                + resultFourthAsDecimal;

        if (marker1) {
            result = result - 256;
        }

        if (marker2) {
            result = result - Math.pow(256, 2);
        }

        if (marker3) {
            result = result - Math.pow(256, 3);
        }

        long resultLong = (long) result;

        System.out.println(resultLong);
    }

    private static int convertToDecimal(String resultAsBinary) {
        int num = Integer.parseInt(resultAsBinary);
        int decimalNumber = 0, i = 0;
        long remainder;
        if (num != 0) {
            while (num != 0) {
                remainder = num % 10;
                num /= 10;
                decimalNumber += remainder * Math.pow(2, i);
                ++i;
            }
        }
        //System.out.println(decimalNumber);
        return decimalNumber;
    }

    private static String subtractBinaries(String firstIPAsBinary, String secondIPAsBinary) {
        int b1 = Integer.parseInt(firstIPAsBinary, 2);
        int b2 = Integer.parseInt(secondIPAsBinary, 2);
        int sum = b1 - b2;
        if (sum < 0) {
            sum = 256 + sum;
            return Integer.toBinaryString(sum) + "-";
        }
        return Integer.toBinaryString(sum);
    }

    private static String[] convertToBinary(int[] intArr) {
        String[] binaryIPStrArr = new String[4];
        String[] binaryOctStrArr = new String[8];
        String binaryOctStr = "";
        for (int i = 0; i <= 3; i++) {
            binaryOctStr = "";
            int index = 0;
            boolean marker = false;
            if (intArr[i] == 0) {
                binaryIPStrArr[i] = "00000000";
            } else {
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
                        //index = index + 1;
                        binaryIPStrArr[i] = string;
                    }
                }

                if (!marker) {
                    for (int j = index - 1; j >= 0; j--) {
                        binaryOctStr = binaryOctStr + binaryOctStrArr[j];
                    }
                    binaryIPStrArr[i] = binaryOctStr;
                }
            }
        }
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
