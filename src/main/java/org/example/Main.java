package org.example;

public class Main {
    public static void main(String[] args) {
        // Пример с кошельком
        Wallet wallet = new Wallet("Иван", 100.0);
        System.out.println("Баланс до траты: " + wallet.getMoney());
        wallet.spend(50);
        System.out.println("Баланс после траты 50: " + wallet.getMoney());
        wallet.spend(200);
        System.out.println("Баланс после попытки потратить 200: " + wallet.getMoney());
        wallet.spend(-10);
        System.out.println("Баланс после попытки потратить -10: " + wallet.getMoney());
        wallet.setMoney(-50);
        System.out.println("Баланс после попытки установить отрицательные деньги: " + wallet.getMoney());

        // Пример с игрой "Угадай число"
        GuessNumber game = new GuessNumber();
        System.out.println(game.checkGuess(50));

        // Пример с телевизором
        TV tv = new TV();
        System.out.println(tv);
        tv.nextChannel();
        tv.increaseVolume();
        System.out.println(tv);
        tv.setCurrentChannel(10);
        tv.setVolume(20);
        System.out.println(tv);

        // Пример с заказом
        SystemOrder order = new SystemOrder();
        order.addItem("Товар 1", 200);
        order.addItem("Товар 2", 150);
        System.out.println(order.getOrderDetails());
    }
}
