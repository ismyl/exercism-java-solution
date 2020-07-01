import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class HandshakeCalculator {

  public final String REVERSE_BIT = "10000";

  List<Signal> calculateHandshake(int number) {

    return Arrays.stream(Signal.values())
        .filter(getSignalCompare(number))
        .sorted(getListComparator(number))
        .collect(Collectors.toList());
  }

  private Comparator<Signal> getListComparator(int number) {
    int intReverseBit = Integer.parseInt(REVERSE_BIT, 2);

    return (number & intReverseBit) == intReverseBit
        ? Comparator.reverseOrder()
        : Comparator.naturalOrder();
  }

  private Predicate<Signal> getSignalCompare(int number) {
    return signal -> (signal.getBitToInt() & number) == signal.getBitToInt();
  }
}
