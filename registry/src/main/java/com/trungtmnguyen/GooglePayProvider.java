package com.trungtmnguyen;

import java.util.UUID;

public class GooglePayProvider implements PaymentProvider {

  @Override
  public Payment processPayment(double amount, String currency) {
    System.out.printf("Processing payment of %.2f %s via Google Pay%n", amount, currency);
    return new Payment(UUID.randomUUID(), amount, currency);
  }
}
