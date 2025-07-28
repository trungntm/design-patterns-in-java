package com.trungntm;

public class GUIFactoryResolver {

  public static GUIFactory getFactory(String osName) {
    switch (osName) {
      case "mac":
        return new MacFactory();
      case "windows":
        return new WindowsFactory();
      default:
        throw new UnsupportedOperationException("Unsupported OS");
    }
  }
}
