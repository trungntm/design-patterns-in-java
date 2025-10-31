package com.trungtmnguyen;

public class FacebookNotification extends AbstractNotification {

  public FacebookNotification(Notification wrappee) {
    super(wrappee);
  }

  @Override
  public void sendNotification(String message) {
    this.wrappee.sendNotification("Facebook notification: " + message);
  }
}
