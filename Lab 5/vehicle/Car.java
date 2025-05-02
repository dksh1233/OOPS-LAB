package com.vehicle;

class Car extends Vehicle {
    protected int seatingCapacity;
    protected String fuelType;

    // Constructor for Car
    public Car(String brand, String model, double price, int seatingCapacity, String fuelType) {
        super(brand, model, price); // Call to superclass constructor
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Seating Capacity: " + seatingCapacity + ", Fuel Type: " + fuelType);
    }
}