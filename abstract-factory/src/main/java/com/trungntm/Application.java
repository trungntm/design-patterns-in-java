package com.trungntm;

public class Application {

  private final Button button;
  private final Checkbox checkbox;

  public Application(GUIFactory factory) {
    button = factory.createButton();
    checkbox = factory.createCheckbox();
  }

  public void render() {
    button.render();
    checkbox.render();
  }

  public void onClick() {
    button.onClick();
  }

  public void onToggle() {
    checkbox.toggle();
  }
}
