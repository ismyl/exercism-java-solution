import java.util.stream.IntStream;

class NaturalNumber {
  private Classification classification;

  public NaturalNumber(int number) {
    if (number < 1)
      throw new IllegalArgumentException("You must supply a natural number (positive integer)");

    int aliquotSum = IntStream.rangeClosed(1, number / 2).filter(i -> number % i == 0).sum();

    if (aliquotSum > number) {
      this.classification = Classification.ABUNDANT;
    } else if (aliquotSum < number) {
      this.classification = Classification.DEFICIENT;
    } else {
      this.classification = Classification.PERFECT;
    }
  }

  public Classification getClassification() {
    return classification;
  }
}
