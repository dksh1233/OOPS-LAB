package com.pie;


public class Circle extends MathConstants {

    void calculateArea(double radius) {
        double area = PI * radius * radius; // Use final PI variable
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }
}

