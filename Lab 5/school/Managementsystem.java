package com.school;

public class Managementsystem {
    public static void main(String[] args) {
        // Create an array of Person references
        Person[] schoolMembers = new Person[4];

        // Add Student and Teacher objects to the array
        schoolMembers[0] = new Student("Alice");
        schoolMembers[1] = new Teacher("Mr. Johnson");
        schoolMembers[2] = new Student("Bob");
        schoolMembers[3] = new Teacher("Ms. Davis");

        // Iterate through the array and call performDuty()
        System.out.println("=== School Members' Duties ===");
        for (Person member : schoolMembers) {
            member.performDuty(); // Calls the correct implementation based on the object type
        }
    }
}