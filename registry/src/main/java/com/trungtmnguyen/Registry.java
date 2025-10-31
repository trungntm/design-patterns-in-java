package com.trungtmnguyen;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Registry {

  private static final Registry INSTANCE = new Registry();
  private final Map<String, PaymentProvider> store;

  private Registry() {
    this.store = new ConcurrentHashMap<>();
  }

  public static Registry getInstance() {
    return INSTANCE;
  }

  public void register(String key, PaymentProvider value) {
    store.put(key, value);
  }

  public PaymentProvider get(String key) {
    return store.get(key);
  }
}
