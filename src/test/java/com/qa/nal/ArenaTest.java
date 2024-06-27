package com.qa.nal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArenaTest {

    private Player playerA;
    private Player playerB;
    private Arena arena;

    @BeforeEach
    public void setup() {
        // Initialize players before each test
        playerA = new Player(50, 5, 10);
        playerB = new Player(100, 10, 5);
        arena = new Arena(playerA, playerB);
    }

    @Test
    public void testFight() {
        // Simulate a fight and check the results
        arena.fight();

        // Assert that one of the players is not alive after the fight
        assertTrue(!playerA.isAlive() || !playerB.isAlive(), "At least one player should not be alive after the fight");
    }
}
