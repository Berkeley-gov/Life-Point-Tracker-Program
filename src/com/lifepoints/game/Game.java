package com.lifepoints.game;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Game extends Player implements Menu {
    // Scanner object used to parse data from user input
    Scanner scnr = new Scanner(System.in);

    // Method will prompt the user to add new players to the game
    public Player addPlayers() {
       System.out.println("Add player name: ");
       return new Player(scnr.nextLine(), 8000);
    }

    // Method will print out all players and their current lifepoints to the console
    public void printAllPlayers(ArrayList<Player> players) {
        for(int i = 0; players.size() > i; i++) {
            System.out.println("Player " + (i + 1) + " " + players.get(i).toString());
        }
    }

    // Method will print the game menu with various options
    public void menu(ArrayList<Player> players) {
        String userInput;

        do {
            Menu.menu();
            System.out.println("\nEnter a choice: ");
            userInput = scnr.nextLine();

            switch(userInput.toUpperCase(Locale.ROOT)) {
                case "A":
                    players.add(addPlayers());
                    break;

                case "P":
                    printAllPlayers(players);
                    break;
            }
        } while(userInput != "Q");
    }


}
