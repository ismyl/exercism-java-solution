import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfMultiplesTest {

  @Test
  public void testNoMultiplesWithinLimit() {

    int[] set = {3, 5};
    int output = new SumOfMultiples(1, set).getSum();
    assertEquals(0, output);
  }

  @Test
  public void testOneFactorHasMultiplesWithinLimit() {

    int[] set = {3, 5};
    int output = new SumOfMultiples(4, set).getSum();
    assertEquals(3, output);
  }

  @Test
  public void testMoreThanOneMultipleWithinLimit() {

    int[] set = {3};
    int output = new SumOfMultiples(7, set).getSum();
    assertEquals(9, output);
  }

  @Test
  public void testMoreThanOneFactorWithMultiplesWithinLimit() {

    int[] set = {3, 5};
    int output = new SumOfMultiples(10, set).getSum();
    assertEquals(23, output);
  }

  @Test
  public void testEachMultipleIsOnlyCountedOnce() {

    int[] set = {3, 5};
    int output = new SumOfMultiples(100, set).getSum();
    assertEquals(2318, output);
  }

  @Test
  public void testAMuchLargerLimit() {

    int[] set = {3, 5};
    int output = new SumOfMultiples(1000, set).getSum();
    assertEquals(233168, output);
  }

  @Test
  public void testThreeFactors() {

    int[] set = {7, 13, 17};
    int output = new SumOfMultiples(20, set).getSum();
    assertEquals(51, output);
  }

  @Test
  public void testFactorsNotRelativelyPrime() {

    int[] set = {4, 6};
    int output = new SumOfMultiples(15, set).getSum();
    assertEquals(30, output);
  }

  @Test
  public void testSomePairsOfFactorsRelativelyPrimeAndSomeNot() {

    int[] set = {5, 6, 8};
    int output = new SumOfMultiples(150, set).getSum();
    assertEquals(4419, output);
  }

  @Test
  public void testOneFactorIsAMultipleOfAnother() {

    int[] set = {5, 25};
    int output = new SumOfMultiples(51, set).getSum();
    assertEquals(275, output);
  }

  @Test
  public void testMuchLargerFactors() {

    int[] set = {43, 47};
    int output = new SumOfMultiples(10000, set).getSum();
    assertEquals(2203160, output);
  }

  @Test
  public void testAllNumbersAreMultiplesOf1() {

    int[] set = {1};
    int output = new SumOfMultiples(100, set).getSum();
    assertEquals(4950, output);
  }

  @Test
  public void testNoFactorsMeanAnEmptySum() {

    int[] set = {};
    int output = new SumOfMultiples(10000, set).getSum();
    assertEquals(0, output);
  }

  @Test
  public void testSumOfMultiplesOfZeroIsZero() {

    int[] set = {0};
    int output = new SumOfMultiples(1, set).getSum();
    assertEquals(0, output);
  }

  @Test
  public void testFactorZeroDoesNotAffectTheSumOfMultiplesOfOtherFactors() {

    int[] set = {3, 0};
    int output = new SumOfMultiples(4, set).getSum();
    assertEquals(3, output);
  }

  @Test
  public void testSolutionsUsingIncludeExcludeMustExtendToCardinalityGreater3() {

    int[] set = {2, 3, 5, 7, 11};
    int output = new SumOfMultiples(10000, set).getSum();
    assertEquals(39614537, output);
  }
}
