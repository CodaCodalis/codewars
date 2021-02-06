import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CaesarCipher {

  public static void main(String[] args) {

    String u = "I should have known that you would have a perfect answer for me!!!";
    int shift = 1;

    movingShift(u, shift);

    List<String> w = movingShift(u, 1);
    demovingShift(w, shift);

  }

  public static List<String> movingShift(String s, int shift) {
    char[] charArray = new char[s.length()];

    for (int i = 0; i < s.length(); i++) {
      charArray[i] = s.charAt(i);
    }

    int letterToShift;
    int shiftedLetter;

    for (int i = 0; i < s.length(); i++) {
      letterToShift = charArray[i];
      shiftedLetter = charArray[i];

      if (letterToShift >= 65 && letterToShift <= 90) {

        if (letterToShift + i + shift <= 90) {
          shiftedLetter = letterToShift + i + shift;
        } else if (letterToShift + i + shift > 90 && letterToShift + i + shift <= 116) {
          shiftedLetter = letterToShift + i + shift - 26;
        } else if (letterToShift + i + shift > 116 && letterToShift + i + shift <= 142) {
          shiftedLetter = letterToShift + i + shift - 52;
        }

      } else if (letterToShift >= 97 && letterToShift <= 122) {

        if (letterToShift + i + shift <= 122) {
          shiftedLetter = letterToShift + i + shift;
        } else if (letterToShift + i + shift > 122 && letterToShift + i + shift <= 148) {
          shiftedLetter = letterToShift + i + shift - 26;
        } else if (letterToShift + i + shift > 148 && letterToShift + i + shift <= 174) {
          shiftedLetter = letterToShift + i + shift - 52;
        }

      } else {
        shiftedLetter = letterToShift;
      }

      charArray[i] = (char) shiftedLetter;
      //System.out.println(charArray[i]);
    }

    String strShifted = new String(charArray);
    //System.out.println(strShifted);

    String[] str = strShifted.split(" ");

    /*
    int strArrayLength = str.length;

    double runnerLength = strArrayLength / 5.0;
    runnerLength = Math.round(runnerLength);
    */

    String[] runnerString = new String[5];

    runnerString[0] = str[0] + " " + str[1] + " " + str[2] + " ";
    runnerString[1] = str[3] + " " + str[4] + " " + str[5];
    runnerString[2] = " " + str[6] + " " + str[7] + " " + str[8]  + " ";
    runnerString[3] = str[9] + " " + str[10];
    runnerString[4] = " " + str[11] + " " + str[12];

    List<String> stringList; //= new ArrayList<String>();
    stringList = Arrays.asList(runnerString);

    //for (String string : stringList)
    //  System.out.println(string);

    return stringList;
  }

  public static String demovingShift(List<String> s, int shift) {
    String strToDeShift = "";
    for (String string : s)
      strToDeShift += string;

    System.out.println("To Demove: " + strToDeShift);

    char[] charArray = new char[strToDeShift.length()];

    for (int i = 0; i < strToDeShift.length(); i++) {
      charArray[i] = strToDeShift.charAt(i);
    }

    int letterToDeShift;
    int deShiftedLetter;

    for (int i = 0; i < strToDeShift.length(); i++) {
      letterToDeShift = charArray[i];
      deShiftedLetter = charArray[i];

      if (letterToDeShift >= 65 && letterToDeShift <= 90) {

        if (letterToDeShift - i - shift < 90 && letterToDeShift - i - shift >= 65) {
          deShiftedLetter = letterToDeShift - i - shift;
        } else if (letterToDeShift - i - shift < 65 && letterToDeShift - i - shift >= 39) {
          deShiftedLetter = letterToDeShift - i - shift + 26;
        } else if (letterToDeShift - i - shift < 39 && letterToDeShift - i - shift >= 13) {
          deShiftedLetter = letterToDeShift - i - shift + 52;
        }

      } else if (letterToDeShift >= 97 && letterToDeShift <= 122) {

        if (letterToDeShift - i - shift < 122 && letterToDeShift - i - shift >= 97) {
          deShiftedLetter = letterToDeShift - i - shift;
        } else if (letterToDeShift - i - shift < 97 && letterToDeShift - i - shift >= 71) {
          deShiftedLetter = letterToDeShift - i - shift + 26;
        } else if (letterToDeShift - i - shift < 71 && letterToDeShift - i - shift >= 45) {
          deShiftedLetter = letterToDeShift - i - shift + 52;
        }

      } else {
        deShiftedLetter = letterToDeShift;
      }

      charArray[i] = (char) deShiftedLetter;
      //System.out.println(charArray[i]);
    }

    String deShifted = new String(charArray);

    System.out.println("Demoved: " + deShifted);

    return deShifted;
  }

}