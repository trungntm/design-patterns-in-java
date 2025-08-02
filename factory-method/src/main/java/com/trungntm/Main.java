package com.trungntm;

public class Main {

  public static void main(String[] args) {
    Logistics logistics = LogisticsFactory.createLogistics("road");

    logistics.planDelivery();
  }
}
