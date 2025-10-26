package com.trungntm;

public class SimpleNotification implements Notification {

  @Override
  public void sendNotification(String message) {
    System.out.printf("Simple notification: %s%n", message);
  }
}
