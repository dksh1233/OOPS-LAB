package com.school;

abstract class Person {
    protected String name;

    // Constructor
    public Person(String name) {
        this.name = name;
    }

    // Abstract method to be overridden by subclasses
    public abstract void performDuty();
}

