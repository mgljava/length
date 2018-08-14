package com.github.mgl.length;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.github.mgl.length.bussi.LengthBussi;
import com.github.mgl.length.model.Length;
import com.github.mgl.length.model.LengthUnit;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class LengthTest {

  @InjectMocks
  private LengthBussi lengthBussi;

  @Test
  public void should_equals_two_mile() {
    // given

    // when
    when(lengthBussi.mile(3)).thenReturn(new Length(3, LengthUnit.MILE));

    // then
    assertThat(lengthBussi.mile(3).equals(lengthBussi.mile(3))).isTrue();
  }
}
