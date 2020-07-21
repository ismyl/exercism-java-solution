import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

class SumOfMultiples {

  private final int limit;
  private final int[] numbers;
  Set<Integer> sumSet =
      new HashSet<>() {
        {
          add(0);
        }
      };

  SumOfMultiples(int number, int[] set) {
    this.limit = number;
    this.numbers = set;
  }

  int getSum() {
    if (limit == 0) return 0;
    for (int number : numbers) {
      if (number == 0) continue;
      IntStream.rangeClosed(1, limit / number)
          .map(loop -> loop * number)
          .filter(value -> value < limit)
          .forEach(sumSet::add);
    }

    return sumSet.stream().mapToInt(Integer::intValue).sum();
  }
}
