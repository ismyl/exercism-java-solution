import java.util.Arrays;
import java.util.stream.Collectors;

class RnaTranscription {

  String transcribe(String dnaStrand) {
    if (dnaStrand.isEmpty()) return "";

    return Arrays.stream(dnaStrand.split(""))
        .map(DnaStrand::valueOf)
        .map(DnaStrand::getRnaConversion)
        .collect(Collectors.joining());
  }

  private enum DnaStrand {
    G("C"),
    C("G"),
    T("A"),
    A("U");

    final String rnaConversion;

    DnaStrand(String rnaConversion) {
      this.rnaConversion = rnaConversion;
    }

    public String getRnaConversion() {
      return rnaConversion;
    }
  }
}
