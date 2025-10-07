package com.trungntm;

public interface PaymentProvider {

  Payment processPayment(double amount, String currency);
}
