class ArmstrongNumbers {

  boolean isArmstrongNumber(int numberToCheck) {
    /* solution 1 (self)
    char[] arrNumberChars = Integer.toString(numberToCheck).toCharArray();
    int numberLength = arrNumberChars.length;
    int powSum = 0;

    for (char num : arrNumberChars) {
      powSum += Math.pow(Character.getNumericValue(num), numberLength);
    }

    return numberToCheck == powSum;
     */

    // solution 2 (best)
    String strNumber = Integer.toString(numberToCheck);
    return numberToCheck ==
        strNumber
            .chars()
            .parallel()
            .map(ch ->
                (int) Math.pow(Character.getNumericValue(ch), strNumber.length()))
            .sum();

  }

}
