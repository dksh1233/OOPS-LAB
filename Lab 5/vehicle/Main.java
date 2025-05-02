package com.vehicle;

public class Main {
    public static void main(String[] args) {
        // Create objects for each subclass
        Car car = new Car("Toyota", "Camry", 30000, 5, "Petrol");
        ElectricCar electricCar = new ElectricCar("Tesla", "Model 3", 50000, 5, "Electric", 75, 8);
        Motorcycle motorcycle = new Motorcycle("Yamaha", "R1", 20000, 998, "Sport");

        // Display details using polymorphism
        System.out.println("=== Car Details ===");
        car.displayDetails();

        System.out.println("\n=== Electric Car Details ===");
        electricCar.displayDetails();

        System.out.println("\n=== Motorcycle Details ===");
        motorcycle.displayDetails();
    }
}