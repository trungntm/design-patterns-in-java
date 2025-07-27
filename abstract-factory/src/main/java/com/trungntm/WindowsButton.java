package com.trungntm;

public class WindowsButton implements Button {

  @Override
  public void render() {
    System.out.println("Rendering windows button");
  }

  @Override
  public void onClick() {
    System.out.println("Clicked on windows button");
  }
}
