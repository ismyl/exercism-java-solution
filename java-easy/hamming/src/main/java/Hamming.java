import java.util.stream.IntStream;

public class Hamming {
  /*
  private char[] arrLeftStrand;
  private char[] arrRightStrand;
   */

  private String leftStrand;
  private String rightStrand;

  public Hamming(String leftStrand, String rightStrand) {
    if (leftStrand.length() != rightStrand.length()) {
      if (leftStrand.isEmpty()) throw new IllegalArgumentException("left strand must not be empty.");
      if (rightStrand.isEmpty()) throw new IllegalArgumentException("right strand must not be empty.");

      throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
    }

    /*
    this.arrLeftStrand = leftStrand.toCharArray();
    this.arrRightStrand = rightStrand.toCharArray();
     */

    this.leftStrand = leftStrand;
    this.rightStrand = rightStrand;
  }

  public int getHammingDistance() {
    return (int) IntStream.range(0, leftStrand.length()).filter(i -> leftStrand.charAt(i) != rightStrand.charAt(i)).count();
    //return (int) IntStream.range(0, this.arrLeftStrand.length).filter(i -> this.arrLeftStrand[i] != this.arrRightStrand[i]).count();
  }
}
