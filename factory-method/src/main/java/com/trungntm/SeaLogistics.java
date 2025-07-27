package com.trungntm;

public class SeaLogistics extends Logistics {

  @Override
  public Transport createTransport() {
    return new Ship();
  }
}
