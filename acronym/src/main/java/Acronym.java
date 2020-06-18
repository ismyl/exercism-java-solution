import java.util.Arrays;

class Acronym {

  private String phrase;

  Acronym(String phrase) {
    this.phrase = phrase;
  }

  String get() {
    StringBuilder tlaString = new StringBuilder();
    Arrays.stream(
            this.phrase
                .replaceAll("[^a-zA-Z- ]", "")
                .replace("-", " ")
                .replaceAll("( )+", " ")
                .split(" "))
        .forEach(s -> tlaString.append(s.charAt(0)));

    return tlaString.toString().toUpperCase();
  }
}
