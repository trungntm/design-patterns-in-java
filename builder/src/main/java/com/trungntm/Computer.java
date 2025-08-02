package com.trungntm;

public class Computer {
  private final String cpu;
  private final String gpu;
  private final int ram;
  private final boolean hasSSD;
  private final String storage;
  private final String motherboard;
  private final boolean hasWiFi;

  private Computer(ComputerBuilder builder) {
    this.cpu = builder.cpu;
    this.gpu = builder.gpu;
    this.ram = builder.ram;
    this.hasSSD = builder.hasSSD;
    this.storage = builder.storage;
    this.motherboard = builder.motherboard;
    this.hasWiFi = builder.hasWiFi;
  }

  // Getters only (immutable object)
  public String getCpu() {
    return cpu;
  }

  public String getGpu() {
    return gpu;
  }

  public int getRam() {
    return ram;
  }

  public boolean hasSSD() {
    return hasSSD;
  }

  public String getStorage() {
    return storage;
  }

  public String getMotherboard() {
    return motherboard;
  }

  public boolean hasWiFi() {
    return hasWiFi;
  }

  @Override
  public String toString() {
    return "Computer{" +
        "cpu='" + cpu + '\'' +
        ", gpu='" + gpu + '\'' +
        ", ram=" + ram + "GB" +
        ", storage='" + storage + '\'' +
        ", motherboard='" + motherboard + '\'' +
        ", hasSSD=" + hasSSD +
        ", hasWiFi=" + hasWiFi +
        '}';
  }

  public static class ComputerBuilder {
    private String cpu;
    private String gpu;
    private int ram;
    private boolean hasSSD = false;
    private String storage = "500GB HDD";
    private String motherboard;
    private boolean hasWiFi = false;

    public ComputerBuilder withCpu(String cpu) {
      this.cpu = cpu;
      return this;
    }

    public ComputerBuilder withGpu(String gpu) {
      this.gpu = gpu;
      return this;
    }

    public ComputerBuilder withRam(int ram) {
      this.ram = ram;
      return this;
    }

    public ComputerBuilder withSSD(boolean hasSSD) {
      this.hasSSD = hasSSD;
      if (hasSSD && storage.contains("HDD")) {
        this.storage = storage.replace("HDD", "SSD");
      }
      return this;
    }

    public ComputerBuilder withStorage(String storage) {
      this.storage = storage;
      return this;
    }

    public ComputerBuilder withMotherboard(String motherboard) {
      this.motherboard = motherboard;
      return this;
    }

    public ComputerBuilder withWiFi(boolean hasWiFi) {
      this.hasWiFi = hasWiFi;
      return this;
    }

    public Computer build() {
      // Validation logic
      if (cpu == null || cpu.trim().isEmpty()) {
        throw new IllegalStateException("CPU is required");
      }
      if (ram <= 0) {
        throw new IllegalStateException("RAM must be positive");
      }
      if (motherboard == null || motherboard.trim().isEmpty()) {
        throw new IllegalStateException("Motherboard is required");
      }

      return new Computer(this);
    }
  }
}
