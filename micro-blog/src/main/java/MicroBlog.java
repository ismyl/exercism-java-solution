class MicroBlog {

  public String truncate(String input) {
    int[] stringPoints = input.codePoints().toArray();

    if (stringPoints.length < 6) return input;

    return new String(stringPoints, 0, 5);
  }
}
