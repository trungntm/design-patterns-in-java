package com.trungntm;

/**
 * Main class demonstrating the Builder Pattern implementation.
 * Shows both direct builder usage and director-based construction.
 */
public class BuilderMain {

  public static void main(String[] args) {
    System.out.println("=== Builder Pattern Demo ===\n");

    // Example 1: Building custom computer step by step
    System.out.println("1. Custom Computer Configuration:");
    try {
      Computer customComputer = new Computer.ComputerBuilder()
          .withCpu("Intel i7-13700K")
          .withGpu("NVIDIA RTX 4070")
          .withRam(32)
          .withMotherboard("ASUS TUF Gaming Z790")
          .withSSD(true)
          .withStorage("1TB NVMe SSD")
          .withWiFi(true)
          .build();

      System.out.println("Custom Computer: " + customComputer);
    } catch (Exception e) {
      System.err.println("Error building custom computer: " + e.getMessage());
    }

    System.out.println("\n" + "=".repeat(50) + "\n");

    // Example 2: Using director for predefined configurations
    System.out.println("2. Predefined Computer Configurations:");

    Computer gamingPC = ComputerDirector.buildGamingPC();
    Computer officePC = ComputerDirector.buildOfficePC();
    Computer serverPC = ComputerDirector.buildServerPC();
    Computer budgetPC = ComputerDirector.buildBudgetPC();

    System.out.println("Gaming PC: " + gamingPC);
    System.out.println("Office PC: " + officePC);
    System.out.println("Server PC: " + serverPC);
    System.out.println("Budget PC: " + budgetPC);

    System.out.println("\n" + "=".repeat(50) + "\n");

    // Example 3: Demonstrating validation
    System.out.println("3. Validation Examples:");

    // This will work - minimal valid configuration
    try {
      Computer minimalPC = new Computer.ComputerBuilder()
          .withCpu("Intel i3-10100")
          .withRam(8)
          .withMotherboard("Basic ATX Board")
          .build();
      System.out.println("Minimal PC: " + minimalPC);
    } catch (Exception e) {
      System.err.println("Error building minimal PC: " + e.getMessage());
    }

    // This will fail - missing required CPU
    try {
      Computer invalidPC = new Computer.ComputerBuilder()
          .withRam(16)
          .withMotherboard("Some Board")
          .build();
      System.out.println("Invalid PC: " + invalidPC);
    } catch (Exception e) {
      System.err.println("Validation Error: " + e.getMessage());
    }

    // This will fail - invalid RAM
    try {
      Computer invalidRAM = new Computer.ComputerBuilder()
          .withCpu("Intel i5")
          .withRam(-8) // Invalid negative RAM
          .withMotherboard("Some Board")
          .build();
      System.out.println("Invalid RAM PC: " + invalidRAM);
    } catch (Exception e) {
      System.err.println("Validation Error: " + e.getMessage());
    }

    System.out.println("\n" + "=".repeat(50) + "\n");

    // Example 4: Demonstrating flexibility
    System.out.println("4. Flexible Configuration:");

    Computer flexiblePC = new Computer.ComputerBuilder()
        .withCpu("AMD Ryzen 7 7700X")
        .withMotherboard("MSI B650 Tomahawk")
        .withRam(16)
        .withStorage("500GB HDD") // Start with HDD
        .withSSD(true) // This will convert HDD to SSD automatically
        .withWiFi(true)
        .build();

    System.out.println("Flexible PC (HDD→SSD conversion): " + flexiblePC);
  }
}
