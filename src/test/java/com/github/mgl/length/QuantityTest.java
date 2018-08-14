package com.github.mgl.length;

import static org.assertj.core.api.Assertions.assertThat;

import com.github.mgl.length.model.Quantity;
import org.junit.jupiter.api.Test;

public class QuantityTest {

  @Test
  void should_5_mile_equals_5_mile() {
    // given

    // when
    boolean result = new Quantity(5, "MILE").equals(new Quantity(5, "MILE"));

    // then
    assertThat(result).isTrue();
  }
}
