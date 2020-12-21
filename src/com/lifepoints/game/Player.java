package com.lifepoints.game;

public class Player {
    String name;
    int lifePoints;

    // Default constructor for player object
    public Player() {
        this.name = "no value";
        this.lifePoints = 8000;
    }

    // Overriden constructor
    public Player(String name, int lifePoints) {
        this.name = name;
        this.lifePoints = lifePoints;
    }

    // Getters and Setters for Player member fields
    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", lifePoints=" + lifePoints +
                '}';
    }
}
