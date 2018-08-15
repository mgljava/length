package com.github.mgl.length;

import static org.assertj.core.api.Assertions.assertThat;

import com.github.mgl.length.model.LengthUnit;
import com.github.mgl.length.model.Length;
import org.junit.jupiter.api.Test;

public class LengthTest {

  @Test
  void should_5_mile_equals_5_mile() {
    // given

    // when
    boolean result = new Length(5, LengthUnit.MILE).equals(new Length(5, LengthUnit.MILE));

    // then
    assertThat(result).isTrue();
  }

  @Test
  void should_1_mile_equals_to_1760_yard() {
    // given

    // when
    boolean result = new Length(1, LengthUnit.MILE).equals(new Length(1760, LengthUnit.YARD));

    // then
    assertThat(result).isTrue();
  }

  @Test
  void should_3_yard_equals_to_3_yard() {
    // given

    // when
    boolean result = new Length(3, LengthUnit.YARD).equals(new Length(3, LengthUnit.YARD));

    // then
    assertThat(result).isTrue();
  }

  @Test
  void should_1_mile_not_equals_to_1761_yard() {
    // given

    // when
    boolean result = new Length(1, LengthUnit.MILE).equals(new Length(1761, LengthUnit.YARD));

    // then
    assertThat(result).isFalse();
  }

  @Test
  void should_3_yard_not_equals_to_4_yard() {
    // given

    // when
    boolean result = new Length(3, LengthUnit.YARD).equals(new Length(4, LengthUnit.YARD));

    // then
    assertThat(result).isFalse();
  }

  @Test
  void should_1_yard_equals_to_3_feet() {
    // given

    // when
    boolean result = new Length(1, LengthUnit.YARD).equals(new Length(3, LengthUnit.FEET));

    // then
    assertThat(result).isTrue();
  }

  @Test
  void should_1_feet_equals_to_12_inch() {
    // given

    // when
    boolean result = new Length(1, LengthUnit.FEET).equals(new Length(12, LengthUnit.INCH));

    // then
    assertThat(result).isTrue();
  }
}
