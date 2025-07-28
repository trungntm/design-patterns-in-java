package com.trungntm;

public class OSDetector {

  public static String detectOS(String osName) {
    if (osName.contains("win")) {
      return "windows";
    } else if (osName.contains("mac")) {
      return "mac";
    } else {
      return "Unsupported OS";
    }
  }
}
