package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GuessNumberTest {

    private GuessNumber game;

    @BeforeEach
    void setUp() {
        game = new GuessNumber(50);
    }

    @Test
    void testGuessLower() {
        assertEquals("Больше", game.checkGuess(30));
    }

    @Test
    void testGuessHigher() {
        assertEquals("Меньше", game.checkGuess(70));
    }

    @Test
    void testGuessCorrect() {
        assertEquals("Угадал!", game.checkGuess(50));
    }
}
