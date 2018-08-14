package com.github.mgl.length.bussi;

import com.github.mgl.length.model.Length;
import com.github.mgl.length.model.LengthUnit;
import org.springframework.stereotype.Service;

@Service
public class LengthBussi {

  public Length mile(int length) {
    Length resultLength = new Length();
    resultLength.setLength(length);
    resultLength.setLengthUnit(LengthUnit.MILE);
    return resultLength;
  }
}
