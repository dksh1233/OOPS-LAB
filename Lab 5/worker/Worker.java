package com.worker;

class Worker {
    protected String name;
    protected double salaryRate;

    // Constructor
    public Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    // Method to compute pay (overridden in subclasses)
    public double computePay(int hours) {
        return 0; // Placeholder; actual computation will be in subclasses
    }

    // Method to display worker details
    public void displayDetails() {
        System.out.println("Worker Name: " + name + ", Salary Rate: $" + salaryRate + " per hour");
    }
}
