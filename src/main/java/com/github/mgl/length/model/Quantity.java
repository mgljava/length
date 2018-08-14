package com.github.mgl.length.model;

public class Quantity {

  private LengthUnit unit;
  private int amount;

  public Quantity(int amount, LengthUnit unit) {
    this.amount = amount;
    this.unit = unit;
  }

  @Override
  public boolean equals(Object obj) {
    Quantity quantity = (Quantity) obj;
    return this.getQuantity() == quantity.getQuantity();
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  private int getQuantity() {
    return amount * unit.getLengthByUnit();
  }
}
