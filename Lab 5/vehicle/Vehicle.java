package com.vehicle;

class Vehicle {
    protected String brand;
    protected String model;
    protected double price;

    // Constructor for Vehicle
    public Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display details (can be overridden)
    public void displayDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: $" + price);
    }
}