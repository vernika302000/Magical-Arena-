package com.qa.nal;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    public void testPlayerInitialization() {
        Player player = new Player(50, 5, 10);
        assertEquals(50, player.getHealth());
        assertEquals(5, player.defend());
        assertEquals(10, player.attack());
    }

    @Test
    public void testReduceHealth() {
        Player player = new Player(50, 5, 10);
        player.reduceHealth(20);
        assertEquals(30, player.getHealth());
        player.reduceHealth(40);
        assertEquals(0, player.getHealth());
    }

    @Test
    public void testIsAlive() {
        Player player = new Player(50, 5, 10);
        assertTrue(player.isAlive());
        player.reduceHealth(50);
        assertFalse(player.isAlive());
    }
}