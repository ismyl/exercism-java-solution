class Proverb {

  private final String[] words;

  Proverb(String[] words) {
    this.words = words;
  }

  String recite() {
    StringBuilder proverbBuilder = new StringBuilder();

    for (int i = 0; i < words.length - 1; i++) {
      proverbBuilder.append(String.format("For want of a %s the %s was lost.\n", words[i], words[i + 1]));
    }

    if (words.length > 0) {
      proverbBuilder.append(String.format("And all for the want of a %s.", words[0]));
    }

    return proverbBuilder.toString();
  }
}
