package com.github.mgl.length.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Length {

  private int length;
  private LengthUnit lengthUnit;

}
