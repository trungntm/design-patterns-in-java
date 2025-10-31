package com.trungtmnguyen;

public class SmsNotification extends AbstractNotification {

  public SmsNotification(Notification wrappee) {
    super(wrappee);
  }

  @Override
  public void sendNotification(String message) {
    this.wrappee.sendNotification("Sms notification: " + message);
  }
}
