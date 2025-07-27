package com.trungntm;

public class Main {

  public static void main(String[] args) {
    Logistics logistics;

    String deliveryType = "road"; // Could come from config/user input

    switch (deliveryType) {
      case "road":
        logistics = new RoadLogistics();
        break;
      case "sea":
        logistics = new SeaLogistics();
        break;
      case "air":
        logistics = new AirLogistics();
        break;
      default:
        logistics = new RoadLogistics();
    }

    logistics.planDelivery();
  }
}
