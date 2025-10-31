package com.trungtmnguyen;

public class AirLogistics extends Logistics {

  @Override
  public Transport createTransport() {
    return new Plane();
  }
}
