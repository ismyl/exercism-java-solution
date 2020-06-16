import java.util.Arrays;

class ResistorColor {

  int colorCode(String color) {
    //return java.util.Arrays.asList(colors()).indexOf(color);
    return Colors.valueOf(color).ordinal();
  }
  /*
  String[] colors() {
    return new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
  }
   */

  String[] colors() {
    return Arrays.stream(Colors.values()).map(Enum::name).toArray(String[]::new);
  }

  private enum Colors {
    black, brown, red, orange, yellow, green, blue, violet, grey, white
  }
}
