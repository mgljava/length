package com.github.mgl.length;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Length {

  private int length;
  private LengthUnit lengthUnit;

  public Length mile(int length) {
    return new Length(length, LengthUnit.MILE);
  }
}
