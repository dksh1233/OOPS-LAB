package com.vehicle;

class ElectricCar extends Car {
    private double batteryCapacity; // in kWh
    private double chargingTime;    // in hours

    // Constructor for ElectricCar
    public ElectricCar(String brand, String model, double price, int seatingCapacity, String fuelType, double batteryCapacity, double chargingTime) {
        super(brand, model, price, seatingCapacity, fuelType); // Call to superclass constructor
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh, Charging Time: " + chargingTime + " hours");
    }
}
