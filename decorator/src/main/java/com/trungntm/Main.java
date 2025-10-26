package com.trungntm;

public class Main {

  public static void main(String[] args) {

    Notification notification = new SimpleNotification();
    notification.sendNotification("Simple notification");

    Notification emailNotification = new EmailNotification(notification);
    emailNotification.sendNotification("Email notification");

    Notification facebookNotification = new FacebookNotification(emailNotification);
    facebookNotification.sendNotification("Facebook notification");

    Notification smsNotification = new SmsNotification(facebookNotification);
    smsNotification.sendNotification("SMS notification");
  }
}
