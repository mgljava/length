package com.github.mgl.length.model;

public class Quantity {

  private String unit;
  private int amount;

  public Quantity(int amount, String unit) {
    this.amount = amount;
    this.unit = unit;
  }

  @Override
  public boolean equals(Object obj) {
    Quantity quantity = (Quantity) obj;
    return this.amount == quantity.amount && this.unit.equals(quantity.unit);
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }
}
