package com.github.mgl.length.model;

public enum LengthUnit {
  MILE {
    private static final int MILE_TO_BASE_UNIT = 1760 * 12 * 3;

    public int getAmountOfBaseUnit() {
      return MILE_TO_BASE_UNIT;
    }
  }
}
