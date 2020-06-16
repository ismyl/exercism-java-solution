import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class ReverseString {

  String reverse(String inputString) {
    if (!inputString.isEmpty()) {
      /*
      StringBuilder returnString = new StringBuilder();
      for (int i = inputString.length(); i > 0; i--) {
        returnString.append(inputString.charAt(i - 1));
      }

      return returnString.toString();
     */

      return new StringBuffer(inputString).reverse().toString();
    }

    return inputString;

  }

}
