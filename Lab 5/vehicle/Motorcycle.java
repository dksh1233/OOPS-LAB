package com.vehicle;

class Motorcycle extends Vehicle {
    private double engineCapacity; // in cc
    private String type;           // e.g., Sport, Cruiser

    // Constructor for Motorcycle
    public Motorcycle(String brand, String model, double price, double engineCapacity, String type) {
        super(brand, model, price); // Call to superclass constructor
        this.engineCapacity = engineCapacity;
        this.type = type;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Engine Capacity: " + engineCapacity + " cc, Type: " + type);
    }
}
