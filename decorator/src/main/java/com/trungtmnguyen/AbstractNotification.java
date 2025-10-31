package com.trungtmnguyen;

public abstract class AbstractNotification implements Notification {

  protected final Notification wrappee;

  public AbstractNotification(Notification wrappee) {
    this.wrappee = wrappee;
  }

  @Override
  public void sendNotification(String message) {
    this.wrappee.sendNotification(message);
  }
}
