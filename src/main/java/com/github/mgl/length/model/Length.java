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
    return this.getQuantity() == length.getQuantity();
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  private int getQuantity() {
    return length * unit.getLengthByUnit();
  }
}
