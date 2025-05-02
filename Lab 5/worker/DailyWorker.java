package com.worker;

class DailyWorker extends Worker {

    // Constructor
    public DailyWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    public double computePay(int hours) {
        int daysWorked = hours / 8; // Assuming 8 hours per day
        return daysWorked * 8 * salaryRate; // Pay based on hours worked
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Daily Worker");
    }
}