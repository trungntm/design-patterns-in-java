package com.trungtmnguyen;

public interface PaymentProvider {

  Payment processPayment(double amount, String currency);
}
