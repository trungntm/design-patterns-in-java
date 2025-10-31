package com.trungtmnguyen;

public class FileDownloadService {

  public void downloadFile(String fileName, Callback<String> callback) {
    // Simulate file download process
    new Thread(() -> {
      try {
        System.out.println("Starting download: " + fileName);

        // Simulate download time
        Thread.sleep(2000);

        // Simulate success/failure
        if (fileName.endsWith(".txt")) {
          callback.onSuccess("File downloaded successfully: " + fileName);
        } else {
          callback.onFailure("Unsupported file format");
        }

      } catch (InterruptedException e) {
        callback.onFailure("Download interrupted: " + e.getMessage());
      }
    }).start();
  }
}
