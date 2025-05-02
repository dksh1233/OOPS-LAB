package com.school;

class Student extends Person {

    // Constructor
    public Student(String name) {
        super(name);
    }

    @Override
    public void performDuty() {
        System.out.println(name + " is studying and completing assignments.");
    }
}
