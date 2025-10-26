package com.trungntm;

public class EmailNotification extends AbstractNotification {

  public EmailNotification(Notification wrappee) {
    super(wrappee);
  }

  @Override
  public void sendNotification(String message) {
    this.wrappee.sendNotification("Email notification: " + message);
  }
}
