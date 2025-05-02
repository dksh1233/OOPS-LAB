package com.worker;

public class Main {
    public static void main(String[] args) {
        // Create objects for DailyWorker and SalariedWorker
        Worker dailyWorker = new DailyWorker("John Doe", 15); // $15 per hour
        Worker salariedWorker = new SalariedWorker("Jane Smith", 20); // $20 per hour

        // Display details and compute pay for each worker
        System.out.println("=== Daily Worker ===");
        dailyWorker.displayDetails();
        System.out.println("Weekly Pay (for 32 hours): $" + dailyWorker.computePay(32));

        System.out.println("\n=== Salaried Worker ===");
        salariedWorker.displayDetails();
        System.out.println("Weekly Pay (for 32 hours): $" + salariedWorker.computePay(32));
    }
}
