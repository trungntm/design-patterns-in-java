package com.trungtmnguyen;

public class FactoryMethodMain {

  public static void main(String[] args) {
    Logistics logistics = LogisticsFactory.createLogistics("road");

    logistics.planDelivery();
  }
}
