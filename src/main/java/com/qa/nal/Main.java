package com.qa.nal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Taking inputs for Player A
        System.out.println("Enter health, strength, and attack values for Player A:");
        System.out.println("Enter Health :");
        int healthA = scn.nextInt();
        System.out.println("Enter Strength :");
        int strengthA = scn.nextInt();
        System.out.println("Enter Attack :");
        int attackA = scn.nextInt();

        // Taking inputs for Player B
        System.out.println("Enter health, strength, and attack values for Player B:");
        System.out.println("Enter Health :");
        int healthB = scn.nextInt();
        System.out.println("Enter Strength :");
        int strengthB = scn.nextInt();
        System.out.println("Enter Attack :");
        int attackB = scn.nextInt();

        scn.close();

        // Initializing players
        Player playerA = new Player(healthA, strengthA, attackA);
        Player playerB = new Player(healthB, strengthB, attackB);

        // Initializing the arena and starting the fight
        Arena arena = new Arena(playerA, playerB);
        arena.fight();
    }
}
