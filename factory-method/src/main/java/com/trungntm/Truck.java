package com.trungntm;

public class Truck implements Transport {

  @Override
  public void deliver() {
    System.out.println("Delivering by land in a truck");
  }

  @Override
  public void startEngine() {
    System.out.println("Starting truck engine");
  }

  @Override
  public void stopEngine() {
    System.out.println("Stopping truck engine");
  }
}
