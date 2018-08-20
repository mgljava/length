package com.github.mgl.fizz_buzz_whizz;

public class FizzBuzzWhizz {

  public String getResultByNumber(int number, final GameNumber gameNumber) {
    String result = "";
    if (isExactDivisible(number, gameNumber.getFizz())) {
      result = "Fizz";
    }

    if (isExactDivisible(number, gameNumber.getBuzz())) {
      result = "Buzz";
    }

    if (isExactDivisible(number, gameNumber.getWhizz())) {
      result = "Whizz";
    }

    if (number % gameNumber.getFizz() == 0 && number % gameNumber.getBuzz() == 0) {
      result = "FizzBuzz";
    }

    if (number % gameNumber.getFizz() == 0 && number % gameNumber.getWhizz() == 0) {
      result = "FizzWhizz";
    }

    if (number % gameNumber.getBuzz() == 0 && number % gameNumber.getWhizz() == 0) {
      result = "BuzzWhizz";
    }

    if (number % gameNumber.getFizz() == 0 && number % gameNumber.getBuzz() == 0
        && number % gameNumber.getWhizz() == 0) {
      result = "FizzBuzzWhizz";
    }

    if (isContains(number, gameNumber.getFizz())) {
      result = "Fizz";
      return result;
    }

    if (isContains(number, gameNumber.getBuzz())) {
      result = "Buzz";
      return result;
    }

    if (isContains(number, gameNumber.getWhizz())) {
      result = "Whizz";
      return result;
    }
    return result.equals("") ? String.valueOf(number) : result;
  }

  private boolean isContains(int number, int otherNumber) {
    return String.valueOf(number).contains(String.valueOf(otherNumber));
  }

  private boolean isExactDivisible(int divisor, int dividend) {
    return divisor % dividend == 0;
  }
}
