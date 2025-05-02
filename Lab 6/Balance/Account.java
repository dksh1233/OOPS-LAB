package com.Balance;

public class Account {
    private double balance;

    // Constructor to initialize the balance
    public Account(double balance) {
        this.balance = balance;
    }

    // Method to display the account balance
    public void Display_Balance() {
        System.out.println("Your account balance is: $" + balance);
    }
}