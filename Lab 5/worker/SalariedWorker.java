package com.worker;

class SalariedWorker extends Worker {

    // Constructor
    public SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    public double computePay(int hours) {
        return 40 * salaryRate; // Fixed pay for 40 hours per week
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Salaried Worker");
    }
}

