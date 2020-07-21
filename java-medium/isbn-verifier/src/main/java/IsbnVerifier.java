import java.util.HashMap;
import java.util.Map;

class IsbnVerifier {

  boolean isValid(String stringToVerify) {
    stringToVerify = stringToVerify.replaceAll("-", "");
    if (stringToVerify.length() != 10) return false;

    Map<Character, Integer> verifyMap =
        new HashMap<>() {
          {
            put('0', 0);
            put('1', 1);
            put('2', 2);
            put('3', 3);
            put('4', 4);
            put('5', 5);
            put('6', 6);
            put('7', 7);
            put('8', 8);
            put('9', 9);
          }
        };

    int modNum = 0;

    int loop = 0;
    while (loop < 10) {
      if (loop == 9) verifyMap.put('X', 10);
      if (!verifyMap.containsKey(stringToVerify.charAt(loop))) return false;

      modNum += verifyMap.get(stringToVerify.charAt(loop)) * (10 - loop);
      loop++;
    }

    return modNum % 11 == 0;
  }
}
