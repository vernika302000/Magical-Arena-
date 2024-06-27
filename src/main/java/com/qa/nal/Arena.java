package com.qa.nal;

import java.util.Random;

public class Arena { // defining a arena class with player and constructor
    private Player playerA;
    private Player playerB;
    private Random random;

    public Arena(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.random = new Random();
    }

    public void fight() {
        Player first = playerA.getHealth() < playerB.getHealth() ? playerA : playerB;
        Player second = (first == playerA) ? playerB : playerA;

        while (playerA.isAlive() && playerB.isAlive()) {
            takeTurn(first, second);
            if (!second.isAlive()) break; // checking whether second player is alive or not
            takeTurn(second, first);
        }

        if (playerA.isAlive()) { // printin the winner and exiting.
            System.out.println("Player A wins!");
        } else {
            System.out.println("Player B wins!");
        }
    }

    private void takeTurn(Player attacker, Player defender) {
        int attackRoll = random.nextInt(6) + 1;
        int defendRoll = random.nextInt(6) + 1;

        int damageDealt = attacker.attack() * attackRoll;
        int damageDefended = defender.defend() * defendRoll;
        int damageToInflict = damageDealt - damageDefended;

        if (damageToInflict > 0) { // adding the defender attacking logic 
            defender.reduceHealth(damageToInflict);
            System.out.println("Attacker inflicts " + damageToInflict + " damage to defender. Defender's health is now " + defender.getHealth());
        } else {
            System.out.println("Defender successfully defends the attack. Defender's health remains " + defender.getHealth());
        }
    }
}
