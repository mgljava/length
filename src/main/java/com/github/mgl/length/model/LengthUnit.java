package com.github.mgl.length.model;

public enum LengthUnit {
  MILE {
    private static final int MILE_UNIT_LENGTH = 1760 * 3 * 12 * 1;

    public int getLengthByUnit() {
      return MILE_UNIT_LENGTH;
    }
  },
  YARD {
    private static final int YARD_UNIT_LENGTH = 3 * 12 * 1;

    public int getLengthByUnit() {
      return YARD_UNIT_LENGTH;
    }
  },
  FEET {
    private static final int FEET_UNIT_LENGTH = 12 * 1;

    public int getLengthByUnit() {
      return FEET_UNIT_LENGTH;
    }
  },
  INCH {
    private static final int INCH_UNIT_LENGTH = 1;

    public int getLengthByUnit() {
      return INCH_UNIT_LENGTH;
    }
  };

  public int getLengthByUnit() {
    return 1;
  }
}
