package com.trungntm;

/**
 * Director class that provides predefined computer configurations.
 * This demonstrates the Director component of the Builder pattern,
 * which encapsulates the construction logic for specific product variations.
 */
public class ComputerDirector {

    /**
     * Builds a high-end gaming computer with powerful components.
     * @return A Computer configured for gaming
     */
    public static Computer buildGamingPC() {
        return new Computer.ComputerBuilder()
            .withCpu("Intel i9-13900K")
            .withGpu("NVIDIA RTX 4090")
            .withRam(32)
            .withMotherboard("ASUS ROG Strix Z790")
            .withStorage("2TB NVMe SSD")
            .withSSD(true)
            .withWiFi(true)
            .build();
    }

    /**
     * Builds a budget-friendly office computer for basic productivity tasks.
     * @return A Computer configured for office work
     */
    public static Computer buildOfficePC() {
        return new Computer.ComputerBuilder()
            .withCpu("Intel i5-13400")
            .withGpu("Intel UHD Graphics")
            .withRam(16)
            .withMotherboard("MSI B760M")
            .withStorage("512GB SSD")
            .withSSD(true)
            .withWiFi(true)
            .build();
    }

    /**
     * Builds a server computer optimized for high performance and reliability.
     * @return A Computer configured for server use
     */
    public static Computer buildServerPC() {
        return new Computer.ComputerBuilder()
            .withCpu("AMD EPYC 7763")
            .withRam(128)
            .withMotherboard("Supermicro H12SSL")
            .withStorage("4TB Enterprise SSD")
            .withSSD(true)
            .withWiFi(false) // Servers typically use wired connections
            .build();
    }

    /**
     * Builds a budget computer with minimal specifications.
     * @return A Computer configured for basic use
     */
    public static Computer buildBudgetPC() {
        return new Computer.ComputerBuilder()
            .withCpu("AMD Ryzen 3 4300G")
            .withGpu("AMD Radeon Graphics")
            .withRam(8)
            .withMotherboard("ASRock A520M")
            .withStorage("256GB SSD")
            .withSSD(true)
            .withWiFi(true)
            .build();
    }
}
