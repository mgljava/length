package com.github.mgl.fizzbuzzwhizz;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import com.github.mgl.fizzbuzzwhizz.model.GameNumber;
import org.junit.Test;

public class FizzBuuWhizzTest {

  FizzBuzzWhizz fizzBuzzWhizz = new FizzBuzzWhizz();

  private final GameNumber gameNumber = new GameNumber(3, 5, 7);

  @Test
  public void should_get_fizz() {
    // given
    String result;
    result = fizzBuzzWhizz.getResultByNumber(3, gameNumber);

    // when

    // then
    assertEquals("Fizz", result);
  }

  @Test
  public void should_get_buzz() {
    // given
    String result;
    result = fizzBuzzWhizz.getResultByNumber(5, gameNumber);

    // when

    // then
    assertEquals("Buzz", result);
  }

  @Test
  public void should_get_whizz() {
    // given
    String result;
    result = fizzBuzzWhizz.getResultByNumber(7, gameNumber);
    // when

    // then
    assertEquals("Whizz", result);
  }

  @Test
  public void should_get_fizz_buzz() {
    // given
    String result;
    result = fizzBuzzWhizz.getResultByNumber(15, gameNumber);

    // when

    // then
    assertEquals("Buzz", result);
  }

  @Test
  public void should_get_fizz_whizz() {
    // given
    String result;
    result = fizzBuzzWhizz.getResultByNumber(42, gameNumber);

    // when

    // then
    assertEquals("FizzWhizz", result);
  }

  @Test
  public void should_get_buzz_whizz() {
    // given
    String result;
    result = fizzBuzzWhizz.getResultByNumber(35, gameNumber);

    // when

    // then
    // assertEquals("BuzzWhizz", result);
    assertEquals("Fizz", result);
  }

  @Test
  public void should_get_fizz_by_contains() {
    // given
    String result;
    result = fizzBuzzWhizz.getResultByNumber(35, gameNumber);

    // when

    // then
    assertEquals("Fizz", result);
  }

  @Test
  public void should_get_buzz_by_contains() {
    // given
    String result;
    result = fizzBuzzWhizz.getResultByNumber(56, gameNumber);

    // when

    // then
    assertEquals("Buzz", result);
  }

  @Test
  public void should_get_whizz_by_contains() {
    // given
    String result;
    result = fizzBuzzWhizz.getResultByNumber(70, gameNumber);

    // when

    // then
    assertEquals("Whizz", result);
  }

  @Test
  public void should_get_fizz_buzz_whizz() {
    // given
    String result;
    result = fizzBuzzWhizz.getResultByNumber(210, gameNumber);

    // when

    // then
    assertEquals("FizzBuzzWhizz", result);
  }

  @Test
  public void should_3_contains_3() {
    // given
    boolean result;
    result = fizzBuzzWhizz.isContains(3, 3);

    // when

    // then
    assertThat(result).isTrue();
  }

  @Test
  public void should_3_two_exact_divisible_3() {
    // given
    boolean result;
    result = fizzBuzzWhizz.twoExactDivisible(35, 5, 7);

    // when

    // then
    assertThat(result).isTrue();
  }
}
