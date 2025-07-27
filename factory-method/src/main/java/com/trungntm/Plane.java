package com.trungntm;

public class Plane implements Transport {

  @Override
  public void deliver() {
    System.out.println("Delivering by air in a plane");
  }

  @Override
  public void startEngine() {
    System.out.println("Starting plane engine");
  }

  @Override
  public void stopEngine() {
    System.out.println("Stopping plane engine");
  }
}
