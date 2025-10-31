package com.trungtmnguyen;

public class CallbackMain {

  public static void main(String[] args) {
    FileDownloadService service = new FileDownloadService();

    // Example 1: Successful download
    service.downloadFile("document.txt", new Callback<>() {
      @Override
      public void onSuccess(String result) {
        System.out.println("✓ " + result);
      }

      @Override
      public void onFailure(String error) {
        System.out.println("✗ Error: " + error);
      }
    });

    // Example 2: Failed download
    service.downloadFile("image.png", new Callback<>() {
      @Override
      public void onSuccess(String result) {
        System.out.println("✓ " + result);
      }

      @Override
      public void onFailure(String error) {
        System.out.println("✗ Error: " + error);
      }
    });

    // Keep main thread alive to see results
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
