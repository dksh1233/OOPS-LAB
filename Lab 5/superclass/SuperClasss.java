package com.superclass;

public class SuperClasss {
    // Private member variable
    private int privateNumber = 100;

    // Public method to access private member
    public int getPrivateNumber() {
        return privateNumber;
    }
}

class SubClass extends SuperClasss {
    public void display() {

        // Correct way: Using the public method from SuperClass
        System.out.println("Private Number (accessed via method): " + getPrivateNumber());
    }
}

