import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class NaturalNumberTest {

  @Test
  public void testSmallPerfectNumberIsClassifiedCorrectly() {
    assertEquals(Classification.PERFECT, new NaturalNumber(6).getClassification());
  }

  @Test
  public void testMediumPerfectNumberIsClassifiedCorrectly() {
    assertEquals(Classification.PERFECT, new NaturalNumber(28).getClassification());
  }

  @Test
  public void testLargePerfectNumberIsClassifiedCorrectly() {
    assertEquals(Classification.PERFECT, new NaturalNumber(33550336).getClassification());
  }

  @Test
  public void testSmallAbundantNumberIsClassifiedCorrectly() {
    assertEquals(Classification.ABUNDANT, new NaturalNumber(12).getClassification());
  }

  @Test
  public void testMediumAbundantNumberIsClassifiedCorrectly() {
    assertEquals(Classification.ABUNDANT, new NaturalNumber(30).getClassification());
  }

  @Test
  public void testLargeAbundantNumberIsClassifiedCorrectly() {
    assertEquals(Classification.ABUNDANT, new NaturalNumber(33550335).getClassification());
  }

  @Test
  public void testSmallestPrimeDeficientNumberIsClassifiedCorrectly() {
    assertEquals(Classification.DEFICIENT, new NaturalNumber(2).getClassification());
  }

  @Test
  public void testSmallestNonPrimeDeficientNumberIsClassifiedCorrectly() {
    assertEquals(Classification.DEFICIENT, new NaturalNumber(4).getClassification());
  }

  @Test
  public void testMediumDeficientNumberIsClassifiedCorrectly() {
    assertEquals(Classification.DEFICIENT, new NaturalNumber(32).getClassification());
  }

  @Test
  public void testLargeDeficientNumberIsClassifiedCorrectly() {
    assertEquals(Classification.DEFICIENT, new NaturalNumber(33550337).getClassification());
  }

  @Test
  /*
   * The number 1 has no proper divisors (https://en.wikipedia.org/wiki/Divisor#Further_notions_and_facts), and the
   * additive identity is 0, so the aliquot sum of 1 should be 0. Hence 1 should be classified as deficient.
   */
  public void testThatOneIsCorrectlyClassifiedAsDeficient() {
    assertEquals(Classification.DEFICIENT, new NaturalNumber(1).getClassification());
  }

  @Test
  public void testThatNonNegativeIntegerIsRejected() {
    IllegalArgumentException expected =
        assertThrows(IllegalArgumentException.class, () -> new NaturalNumber(0));

    assertThat(expected).hasMessage("You must supply a natural number (positive integer)");
  }

  @Test
  public void testThatNegativeIntegerIsRejected() {
    IllegalArgumentException expected =
        assertThrows(IllegalArgumentException.class, () -> new NaturalNumber(-1));

    assertThat(expected).hasMessage("You must supply a natural number (positive integer)");
  }
}
