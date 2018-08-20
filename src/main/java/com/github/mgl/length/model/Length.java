package com.github.mgl.length.model;

public class Length {

  private LengthUnit unit;
  private int length;

  public Length(int length, LengthUnit unit) {
    this.length = length;
    this.unit = unit;
  }

  @Override
  public boolean equals(Object obj) {
    Length length = (Length) obj;
    return this.getLength() == length.getLength();
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  private int getLength() {
    return length * unit.getLengthByUnit();
  }
}
