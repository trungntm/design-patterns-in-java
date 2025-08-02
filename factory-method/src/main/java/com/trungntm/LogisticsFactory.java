package com.trungntm;

public class LogisticsFactory {

  public static Logistics createLogistics(String deliveryType) {
    return switch (deliveryType) {
      case "road" -> new RoadLogistics();
      case "sea" -> new SeaLogistics();
      case "air" -> new AirLogistics();
      default -> new RoadLogistics();
    };
  }
}
