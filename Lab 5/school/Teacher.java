package com.school;

class Teacher extends Person {

    // Constructor
    public Teacher(String name) {
        super(name);
    }

    @Override
    public void performDuty() {
        System.out.println(name + " is teaching and preparing lesson plans.");
    }
}