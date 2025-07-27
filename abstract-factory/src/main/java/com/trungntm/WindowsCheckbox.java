package com.trungntm;

public class WindowsCheckbox implements Checkbox {

  @Override
  public void render() {
    System.out.println("Rendering windows checkbox");
  }

  @Override
  public void toggle() {
    System.out.println("Windows button toggled");
  }
}
