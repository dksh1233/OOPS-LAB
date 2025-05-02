package com.player;

class CricketPlayer extends Player {
    public CricketPlayer(String name, int age, String position) {
        super(name, age, position);
    }

    public void play() {
        System.out.println(name + " is playing a cricket match.");
    }

    public void train() {
        System.out.println(name + " is practicing batting and bowling.");
    }
}
