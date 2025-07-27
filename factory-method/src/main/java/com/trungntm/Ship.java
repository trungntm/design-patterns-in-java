package com.trungntm;

public class Ship implements Transport {

  @Override
  public void deliver() {
    System.out.println("Delivering by sea in a ship");
  }

  @Override
  public void startEngine() {
    System.out.println("Starting ship engine");
  }

  @Override
  public void stopEngine() {
    System.out.println("Stopping ship engine");
  }
}
