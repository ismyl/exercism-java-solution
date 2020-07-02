class Yacht {

  private final int[] dices;
  private final YachtCategory yachtCategory;

  Yacht(int[] dice, YachtCategory yachtCategory) {
    if (dice.length != 5) {
      throw new IllegalArgumentException();
    }

    this.dices = dice;
    this.yachtCategory = yachtCategory;
  }

  int score() {
    return yachtCategory.calculateScore(dices);
  }
}
