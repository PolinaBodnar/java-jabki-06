package org.example;

import java.util.Random;

public class GuessNumber {
    private int secretNumber;

    public GuessNumber() {
        this(new Random().nextInt(100) + 1);
    }

    public GuessNumber(int secretNumber) {
        this.secretNumber = secretNumber;
    }

    public String checkGuess(int guess) {
        if (guess < secretNumber) {
            return "Больше";
        } else if (guess > secretNumber) {
            return "Меньше";
        } else {
            return "Угадал!";
        }
    }
}

