import java.util.stream.IntStream;

public class PangramChecker {
  public boolean isPangram(String input) {
    int[] chars = IntStream.range('a', 'z').toArray();
    input = input.toLowerCase();

    for (int ch : chars) {
      if (input.indexOf(ch) < 0) {
        return false;
      }
    }

    return true;
  }
}
