package com.trungntm;

public abstract class Logistics {

  /**
   * Factory method that creates a transport object.
   * This method must be implemented by concrete subclasses to return
   * the appropriate transport type for their specific logistics strategy.
   *
   * @return Transport instance specific to the logistics type
   */
  public abstract Transport createTransport();

  public void planDelivery() {
    Transport transport = createTransport();
    transport.startEngine();
    transport.deliver();
    transport.stopEngine();
  }
}
