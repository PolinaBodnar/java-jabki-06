//package org.example.guessnumber;
//
//import java.util.Random;
//
//public class GuessNumber {
//    private int secretNumber;
//
//    public GuessNumber() {
//        Random rand = new Random();
//        this.secretNumber = rand.nextInt(100) + 1; // Генерируем случайное число от 1 до 100
//    }
//
//    public String checkGuess(int guess) {
//        if (guess < secretNumber) {
//            return "Меньше";
//        } else if (guess > secretNumber) {
//            return "Больше";
//        } else {
//            return "Угадал";
//        }
//    }
//}
