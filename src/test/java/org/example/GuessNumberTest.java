import org.example.guessnumber.GuessNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GuessNumberTest {

    @Test
    public void testGuessNumber() {
        GuessNumber game = new GuessNumber();
        int secretNumber = game.checkGuess(50);  // Используем число 50, например.
        String result = game.checkGuess(secretNumber);
        assertEquals("Угадал", result);
    }

    @Test
    public void testGuessTooHigh() {
        GuessNumber game = new GuessNumber();
        assertEquals("Меньше", game.checkGuess(150));
    }

    @Test
    public void testGuessTooLow() {
        GuessNumber game = new GuessNumber();
        assertEquals("Больше", game.checkGuess(10));
    }
}
