package com.trungntm;

public class Main {

  public static void main(String[] args) {
    GUIFactory factory;
    String osName = System.getProperty("os.name").toLowerCase();

    if (osName.contains("windows")) {
      factory = new WindowsFactory();
    } else if (osName.contains("mac")) {
      factory = new MacFactory();
    } else {
      throw new UnsupportedOperationException("Unsupported OS");
    }

    Application app = new Application(factory);
    app.render();
    app.onClick();
    app.onToggle();
  }

}
