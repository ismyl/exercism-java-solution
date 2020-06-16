import java.math.BigInteger;

class Grains {

  private final int MIN_SQUARE_NUM = 1;
  private final int MAX_SQUARE_NUM = 64;

  BigInteger grainsOnSquare(final int square) {
    if (square < MIN_SQUARE_NUM || square > MAX_SQUARE_NUM) {
      throw new IllegalArgumentException("square must be between 1 and 64");
    }

    /* best solution
    return new BigInteger(1).shiftLeft(square - 1);
     */
    return new BigInteger("2").pow(square - 1);
  }

  BigInteger grainsOnBoard() {

    /* best solution
    return new BigInteger("1").shiftLeft(64).subtract(BigInteger.valueOf(1));
     */
    return BigInteger.TWO.pow(MAX_SQUARE_NUM).subtract(BigInteger.ONE);
  }
}
