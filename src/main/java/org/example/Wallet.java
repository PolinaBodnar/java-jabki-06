package org.example;

public class Wallet {
    private String owner;
    private double money;

    public Wallet(String owner, double money) {
        this.owner = owner;
        this.money = money >= 0 ? money : 0;
    }

    public String getOwner() {
        return owner;
    }

    public double getMoney() {
        return money;
    }

    // Метод setMoney с новой проверкой
    public void setMoney(double money) {
        if (money >= 0) {
            this.money = money;
        } else {
            System.out.println("Деньги не могут быть отрицательными!");
        }
    }

    public void spend(double amount) {
        if (amount <= 0) {
            System.out.println("Сумма траты должна быть больше нуля!");
        } else if (amount > money) {
            System.out.println("Недостаточно денег!");
        } else {
            money -= amount;
        }
    }
}
