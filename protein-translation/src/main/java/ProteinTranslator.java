import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class ProteinTranslator {

  List<String> translate(String rnaSequence) {
    List<String> proteinList = new ArrayList<>();

    for (int i = 0; rnaSequence.length() > i; i = i + 3) {
      String protein = CodonProteinMap.valueOf(rnaSequence.substring(i, i + 3)).getProtein();

      if (protein.isBlank()) {
        break;
      }
      proteinList.add(protein);
    }

    return proteinList;
  }

  List<String> translateStream(String rnaSequence) {
    return IntStream.iterate(0, i -> rnaSequence.length() > i, i -> i + 3)
        .mapToObj(i -> CodonProteinMap.valueOf(rnaSequence.substring(i, i + 3)).getProtein())
        .takeWhile(protein -> !protein.isBlank())
        .collect(Collectors.toList());
  }

  enum CodonProteinMap {
    AUG("Methionine"),
    UUU("Phenylalanine"),
    UUC(UUU.getProtein()),
    UUA("Leucine"),
    UUG(UUA.getProtein()),
    UCU("Serine"),
    UCC(UCU.getProtein()),
    UCA(UCU.getProtein()),
    UCG(UCU.getProtein()),
    UAU("Tyrosine"),
    UAC(UAU.getProtein()),
    UGU("Cysteine"),
    UGC(UGU.getProtein()),
    UGG("Tryptophan"),
    UAA(""),
    UAG(UAA.getProtein()),
    UGA(UAA.getProtein());

    private String protein;

    CodonProteinMap(String protein) {
      this.protein = protein;
    }

    public String getProtein() {
      return protein;
    }
  }
}
