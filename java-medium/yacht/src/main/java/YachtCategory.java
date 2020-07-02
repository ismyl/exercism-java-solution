import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

enum YachtCategory {
  YACHT {
    public Integer calculateScore(int[] dices) {
      Map<Integer, Integer> diceMap = new HashMap<>();

      for (int dice : dices) {
        diceMap.put(dice, diceMap.getOrDefault(dice, 0) + 1);
      }

      if (diceMap.keySet().size() == 1) return 50;
      return 0;
    }
  },
  ONES {
    public Integer calculateScore(int[] dices) {
      return getLoopScore(dices, 1);
    }
  },
  TWOS {
    public Integer calculateScore(int[] dices) {
      return getLoopScore(dices, 2);
    }
  },
  THREES {
    public Integer calculateScore(int[] dices) {
      return getLoopScore(dices, 3);
    }
  },
  FOURS {
    public Integer calculateScore(int[] dices) {
      return getLoopScore(dices, 4);
    }
  },
  FIVES {
    public Integer calculateScore(int[] dices) {
      return getLoopScore(dices, 5);
    }
  },
  SIXES {
    public Integer calculateScore(int[] dices) {
      return getLoopScore(dices, 6);
    }
  },
  FULL_HOUSE {
    public Integer calculateScore(int[] dices) {
      Map<Integer, Integer> diceMap = new HashMap<>();

      for (int dice : dices) {
        diceMap.put(dice, diceMap.getOrDefault(dice, 0) + 1);
      }

      if (diceMap.keySet().size() == 2) {
        for (Integer key : diceMap.keySet()) {
          if (diceMap.get(key) == 2 || diceMap.get(key) == 3) return Arrays.stream(dices).sum();
        }
      }

      return 0;
    }
  },
  FOUR_OF_A_KIND {
    public Integer calculateScore(int[] dices) {
      Map<Integer, Integer> diceMap = new HashMap<>();

      for (int dice : dices) {
        diceMap.put(dice, diceMap.getOrDefault(dice, 0) + 1);
      }

      for (Integer key : diceMap.keySet()) {
        if (diceMap.get(key) >= 4) return key * 4;
      }

      return 0;
    }
  },
  LITTLE_STRAIGHT {
    public Integer calculateScore(int[] dices) {
      return getStraightScore(dices, 1);
    }
  },
  BIG_STRAIGHT {
    public Integer calculateScore(int[] dices) {
      return getStraightScore(dices, 2);
    }
  },
  CHOICE {
    public Integer calculateScore(int[] dices) {
      return Arrays.stream(dices).sum();
    }
  };

  private static Integer getStraightScore(int[] dices, int loopStart) {
    Arrays.sort(dices);
    for (int dice : dices) {
      if (dice != loopStart) return 0;
      loopStart++;
    }

    return 30;
  }

  private static Integer getLoopScore(int[] dices, int i) {
    return Math.toIntExact(Arrays.stream(dices).filter(number -> number == i).sum());
  }

  public abstract Integer calculateScore(int[] dices);
}
