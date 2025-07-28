package com.trungntm;

public class Main {

  public static void main(String[] args) {
    String osName = OSDetector.detectOS(System.getProperty("os.name").toLowerCase());
    GUIFactory factory = GUIFactoryResolver.getFactory(osName);

    Application app = new Application(factory);
    app.render();
    app.onClick();
    app.onToggle();
  }

}
