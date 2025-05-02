package com.player;

public class SportsDemo {
    public static void main(String[] args) {
        // Creating player objects
        CricketPlayer cricketer = new CricketPlayer("Virat", 34, "Batsman");
        FootballPlayer footballer = new FootballPlayer("Messi", 36, "Forward");
        HockeyPlayer hockeyPlayer = new HockeyPlayer("Dhyan", 30, "Midfielder");

        // Displaying details and calling methods
        System.out.println("\nCricket Player:");
        cricketer.displayDetails();
        cricketer.play();
        cricketer.train();

        System.out.println("\nFootball Player:");
        footballer.displayDetails();
        footballer.play();
        footballer.train();

        System.out.println("\nHockey Player:");
        hockeyPlayer.displayDetails();
        hockeyPlayer.play();
        hockeyPlayer.train();
    }
}
