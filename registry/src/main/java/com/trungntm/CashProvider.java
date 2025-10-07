package com.trungntm;

import java.util.UUID;

public class CashProvider implements PaymentProvider {

  @Override
  public Payment processPayment(double amount, String currency) {
    System.out.printf("Processing payment of %.2f %s via Cash%n", amount, currency);
    return new Payment(UUID.randomUUID(), amount, currency);
  }
}
