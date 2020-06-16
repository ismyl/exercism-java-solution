import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class ResistorColorDuo {
  int value(String[] colors) {
    List<String> registers =
        Arrays.stream(
            new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"})
            .collect(Collectors.toList());

    StringBuilder returnValue = new StringBuilder();

    for (String color : colors) {
      returnValue.append(registers.indexOf(color));
    }

    return Integer.parseInt(returnValue.toString().substring(0, 2));
  }
}
