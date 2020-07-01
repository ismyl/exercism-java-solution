enum Signal {
  WINK("1"),
  DOUBLE_BLINK("10"),
  CLOSE_YOUR_EYES("100"),
  JUMP("1000");

  private String bit;

  Signal(String bitOperator) {
    this.bit = bitOperator;
  }

  public String getBit() {
    return bit;
  }

  public int getBitToInt() {
    return Integer.parseInt(bit, 2);
  }
}
