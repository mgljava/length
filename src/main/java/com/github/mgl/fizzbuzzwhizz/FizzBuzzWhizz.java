package com.github.mgl.fizzbuzzwhizz;

import com.github.mgl.fizzbuzzwhizz.model.GameNumber;
import java.util.Scanner;

public class FizzBuzzWhizz {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int fizzNumber = scanner.nextInt();
    int buzzNumber = scanner.nextInt();
    int whizzNumber = scanner.nextInt();

    for (int i = 1; i <= 100; i++) {
      // System.out.println(show(i, fizzNumber, buzzNumber, whizzNumber));
      System.out.println(new FizzBuzzWhizz()
          .getResultByNumber(i, new GameNumber(fizzNumber, buzzNumber, whizzNumber)));
    }
  }

  public String getResultByNumber(int number, final GameNumber gameNumber) {
    // 1.只要包含了就直接返回
    String result = "";

    if (isContains(number, gameNumber.getFizz())) {
      result = "Fizz";
    } else if (isContains(number, gameNumber.getBuzz())) {
      result = "Buzz";
    } else if (isContains(number, gameNumber.getWhizz())) {
      result = "Whizz";
    }
    if (!"".equals(result)) {
      return result;
    }

    if (isExactDivisible(number, gameNumber.getFizz())) {
      result = "Fizz";
      if (twoExactDivisible(number, gameNumber.getFizz(), gameNumber.getBuzz())) {
        result = "FizzBuzz";
      }
      if (twoExactDivisible(number, gameNumber.getFizz(), gameNumber.getWhizz())) {
        result = "FizzWhizz";
      }
    }
    if (isExactDivisible(number, gameNumber.getBuzz())) {
      result = "Buzz";
      if (twoExactDivisible(number, gameNumber.getFizz(), gameNumber.getWhizz())) {
        result = "FizzWhizz";
      }
      if (twoExactDivisible(number, gameNumber.getFizz(), gameNumber.getBuzz())) {
        result = "FizzBuzz";
      }
    }
    if (isExactDivisible(number, gameNumber.getWhizz())) {
      result = "Whizz";
      if (twoExactDivisible(number, gameNumber.getBuzz(), gameNumber.getWhizz())) {
        result = "BuzzWhizz";
      }
      if (twoExactDivisible(number, gameNumber.getFizz(), gameNumber.getWhizz())) {
        result = "FizzWhizz";
      }
    }
    if (threeExactDivisible(number, gameNumber.getFizz(), gameNumber.getBuzz(),
        gameNumber.getWhizz())) {
      result = "FizzBuzzWhizz";
    }

    return result.equals("") ? String.valueOf(number) : result;
  }

  public boolean isContains(int number, int otherNumber) {
    return String.valueOf(number).contains(String.valueOf(otherNumber));
  }

  public boolean isExactDivisible(int divisor, int dividend) {
    return divisor % dividend == 0;
  }

  /*public boolean isContainsAndExactDivisible(int divisor, int dividend) {
    return String.valueOf(divisor).contains(String.valueOf(dividend)) || divisor % dividend == 0;
  }*/

  public boolean twoExactDivisible(int divisor, int dividend1, int dividend2) {
    return (divisor % dividend1 == 0) && (divisor % dividend2 == 0);
  }

  private boolean threeExactDivisible(int divisor, int dividend1, int dividend2, int dividend3) {
    return (divisor % dividend1 == 0) && (divisor % dividend2 == 0) && (divisor % dividend3 == 0);
  }
}
