package Lab8.Serializable_lab8;
import java.io.*;
import java.io.Serializable;

// Person class implementing Serializable
class Person implements Serializable {
    private static final long serialVersionUID = 1L; // Ensures version compatibility
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Display method
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
