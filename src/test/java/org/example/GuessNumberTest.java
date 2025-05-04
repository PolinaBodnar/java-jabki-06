package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GuessNumberTest {

    @Test
    void testGuessLower() {
        GuessNumber game = new GuessNumber(50);
        assertEquals("Больше", game.checkGuess(30));
    }

    @Test
    void testGuessHigher() {
        GuessNumber game = new GuessNumber(50);
        assertEquals("Меньше", game.checkGuess(70));
    }

    @Test
    void testGuessCorrect() {
        GuessNumber game = new GuessNumber(50);
        assertEquals("Угадал!", game.checkGuess(50));
    }
}
