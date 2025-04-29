//package org.example;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
//public class Main {
//
//    public static void main(String[] args) {
//        // Пример с кошельком
//        Wallet wallet = new Wallet("Иван", 100.0);
//        System.out.println("Баланс до траты: " + wallet.getMoney());
//        wallet.spend(50);
//        System.out.println("Баланс после траты 50: " + wallet.getMoney());
//        wallet.spend(200);
//        System.out.println("Баланс после попытки потратить 200: " + wallet.getMoney());
//        wallet.spend(-10);
//        System.out.println("Баланс после попытки потратить -10: " + wallet.getMoney());
//        wallet.setMoney(-50);
//        System.out.println("Баланс после попытки установить отрицательные деньги: " + wallet.getMoney());
//
//        // Пример с игрой "Угадай число"
//        GuessNumber game = new GuessNumber();
//        System.out.println(game.checkGuess(50));  // Попробуем угадать число
//
//        // Пример с телевизором
//        TV tv = new TV();
//        System.out.println(tv);
//        tv.nextChannel();
//        tv.increaseVolume();
//        System.out.println(tv);
//        tv.setCurrentChannel(10);
//        tv.setVolume(20);
//        System.out.println(tv);
//
//        // Пример с заказом
//        SystemOrder order = new SystemOrder();
//        order.addItem("Товар 1", 200);
//        order.addItem("Товар 2", 150);
//        System.out.println(order.getOrderDetails());
//    }
//
//    // Класс "Кошелек"
//    static class Wallet {
//        private String owner;
//        private double money;
//
//        public Wallet(String owner, double money) {
//            this.owner = owner;
//            this.money = money >= 0 ? money : 0;
//        }
//
//        public String getOwner() {
//            return owner;
//        }
//
//        public double getMoney() {
//            return money;
//        }
//
//        public void setMoney(double money) {
//            if (money >= 0) {
//                this.money = money;
//            } else {
//                System.out.println("Деньги не могут быть отрицательными!");
//            }
//        }
//
//        public void spend(double amount) {
//            if (amount <= 0) {
//                System.out.println("Сумма траты должна быть больше нуля!");
//            } else if (amount > money) {
//                System.out.println("Недостаточно денег!");
//            } else {
//                money -= amount;
//            }
//        }
//    }
//
//    // Класс "Угадай число"
//    static class GuessNumber {
//        private int secretNumber;
//        private Random random;
//
//        public GuessNumber() {
//            random = new Random();
//            secretNumber = random.nextInt(100) + 1;  // Случайное число от 1 до 100
//        }
//
//        public String checkGuess(int guess) {
//            if (guess < secretNumber) {
//                return "Больше";
//            } else if (guess > secretNumber) {
//                return "Меньше";
//            } else {
//                return "Угадал!";
//            }
//        }
//    }
//
//    // Класс "Телевизор"
//    static class TV {
//        private int currentChannel;
//        private int volume;
//
//        public TV() {
//            this.currentChannel = 1;
//            this.volume = 50;
//        }
//
//        public int getCurrentChannel() {
//            return currentChannel;
//        }
//
//        public void setCurrentChannel(int currentChannel) {
//            if (currentChannel >= 1 && currentChannel <= 50) {
//                this.currentChannel = currentChannel;
//            } else {
//                System.out.println("Неправильный канал. Канал должен быть от 1 до 50.");
//            }
//        }
//
//        public int getVolume() {
//            return volume;
//        }
//
//        public void setVolume(int volume) {
//            if (volume >= 0 && volume <= 100) {
//                this.volume = volume;
//            } else {
//                System.out.println("Неправильный уровень громкости. Громкость должна быть от 0 до 100.");
//            }
//        }
//
//        public void nextChannel() {
//            if (currentChannel < 50) {
//                currentChannel++;
//            } else {
//                currentChannel = 1;
//            }
//        }
//
//        public void increaseVolume() {
//            if (volume < 100) {
//                volume++;
//            } else {
//                System.out.println("Громкость уже на максимуме!");
//            }
//        }
//
//        public void decreaseVolume() {
//            if (volume > 0) {
//                volume--;
//            } else {
//                System.out.println("Громкость уже на минимуме!");
//            }
//        }
//
//        @Override
//        public String toString() {
//            return "Текущий канал: " + currentChannel + ", Громкость: " + volume;
//        }
//    }
//
//    // Класс "Система заказа"
//    static class SystemOrder {
//        private static int orderIdCounter = 1;
//        private int orderId;
//        private List<String> items;
//        private double totalPrice;
//
//        public SystemOrder() {
//            this.orderId = orderIdCounter++;
//            this.items = new ArrayList<>();
//            this.totalPrice = 0;
//        }
//
//        public void addItem(String item, double price) {
//            items.add(item);
//            totalPrice += price;
//        }
//
//        public String getOrderDetails() {
//            StringBuilder details = new StringBuilder("Заказ #" + orderId + "\nТовары:\n");
//            for (String item : items) {
//                details.append(item).append("\n");
//            }
//            details.append("Общая стоимость: ").append(totalPrice);
//            return details.toString();
//        }
//    }
//}
