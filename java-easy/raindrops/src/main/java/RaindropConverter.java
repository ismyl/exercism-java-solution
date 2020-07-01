import java.util.Arrays;

class RaindropConverter {

  String convert(int number) {
    return Arrays.stream(RainDropFactor.values())
        .filter(factor -> number % factor.getNumber() == 0)
        .map(RainDropFactor::getOutput)
        .reduce(String::concat)
        .orElse(Integer.toString(number));
  }

  private enum RainDropFactor {
    PLING(3, "Pling"),
    PLANG(5, "Plang"),
    PLONG(7, "Plong");

    private int number;
    private String output;

    RainDropFactor(int number, String output) {
      this.number = number;
      this.output = output;
    }

    public int getNumber() {
      return number;
    }

    public String getOutput() {
      return output;
    }
  }
}
