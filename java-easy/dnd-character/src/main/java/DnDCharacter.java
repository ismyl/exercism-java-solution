import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

class DnDCharacter {
  private Random rnd;

  private int STRENGTH;
  private int DEXTERITY;
  private int CONSTITUTION;
  private int INTELLIGENCE;
  private int WISDOM;
  private int CHARISMA;

  DnDCharacter() {
    try {
      rnd = SecureRandom.getInstanceStrong();
    } catch (NoSuchAlgorithmException e) {
      e.printStackTrace();
    }

    this.STRENGTH = ability();
    this.DEXTERITY = ability();
    this.CONSTITUTION = ability();
    this.INTELLIGENCE = ability();
    this.WISDOM = ability();
    this.CHARISMA = ability();
  }

  /*
  int rollDice(int diceNum) {
    return rnd.nextInt(diceNum) + 1;
  }
   */

  int ability() {
    /*
    int[] stats = IntStream.range(0, 4).map(i -> rollDice(6)).sorted().toArray();

    return Arrays.stream(stats).parallel().sum() - stats[0];
     */
    return rnd.ints(4, 1, 7)
        .sorted().skip(1).sum();
  }

  int modifier(int input) {
    return Math.floorDiv((input - 10), 2);
  }

  int getStrength() {
    return this.STRENGTH;
  }

  int getDexterity() {
    return this.DEXTERITY;
  }

  int getConstitution() {
    return this.CONSTITUTION;
  }

  int getIntelligence() {
    return this.INTELLIGENCE;
  }

  int getWisdom() {
    return this.WISDOM;
  }

  int getCharisma() {
    return this.CHARISMA;
  }

  int getHitpoints() {
    return 10 + modifier(getConstitution());
  }
}
