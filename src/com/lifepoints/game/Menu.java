package com.lifepoints.game;

public interface Menu {
    public static void menu() {
        System.out.println("Duel Menu");
        System.out.println("A - Add players to game");
        System.out.println("E - Edit player name");
        System.out.println("L - Change player's lifepoints");
        System.out.println("S - Start duel");
        System.out.println("Q - quit duel");
    }

    public static void printLine(int num) {
        for(int i = 0; i < num; i++) {
            System.out.println("***********************************************************************************************");
        }
    }
}
