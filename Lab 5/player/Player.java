package com.player;

class Player {
    String name;
    int age;
    String position;


    public Player(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }


    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Position: " + position);
    }

    // General methods for playing and training
    public void play() {
        System.out.println(name + " is playing the game.");
    }

    public void train() {
        System.out.println(name + " is training.");
    }
}