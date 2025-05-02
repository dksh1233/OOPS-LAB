package com.player;

class HockeyPlayer extends Player {
    public HockeyPlayer(String name, int age, String position) {
        super(name, age, position);
    }

    public void play() {
        System.out.println(name + " is playing a hockey match.");
    }

    public void train() {
        System.out.println(name + " is practicing stick handling.");
    }
}