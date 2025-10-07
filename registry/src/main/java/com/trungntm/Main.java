package com.trungntm;

public class Main {

  public static void main(String[] args) {
    // Initialize the registry with payment providers
    Registry paymentRegistry = Registry.getInstance();
    paymentRegistry.register("applePay", new ApplePayProvider());
    paymentRegistry.register("googlePay", new GooglePayProvider());
    paymentRegistry.register("cash", new CashProvider());

    // Retrieve and use a Apple Pay provider
    PaymentProvider provider = paymentRegistry.get("applePay");
    provider.processPayment(100, "USD");

    // Retrieve and use a Google Pay provider
    provider = paymentRegistry.get("googlePay");
    provider.processPayment(200, "EUR");

    // Retrieve and use a Cash provider
    provider = paymentRegistry.get("cash");
    provider.processPayment(50, "USD");
  }
}
