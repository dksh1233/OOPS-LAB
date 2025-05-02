package com.player;

class FootballPlayer extends Player {
    public FootballPlayer(String name, int age, String position) {
        super(name, age, position);
    }

    public void play() {
        System.out.println(name + " is playing a football match.");
    }

    public void train() {
        System.out.println(name + " is practicing dribbling and passing.");
    }
}

