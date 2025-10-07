package com.trungntm;

import java.util.UUID;

public class ApplePayProvider implements PaymentProvider {

  @Override
  public Payment processPayment(double amount, String currency) {
    System.out.printf("Processing payment of %.2f %s via Apple Pay%n", amount, currency);
    return new Payment(UUID.randomUUID(), amount, currency);
  }
}
