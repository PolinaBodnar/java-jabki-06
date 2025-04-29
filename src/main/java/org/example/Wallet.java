package org.example.wallet;

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

    public void setMoney(double money) {
        if (money >= 0) {
            this.money = money;
        } else {
            throw new IllegalArgumentException("Сумма не может быть отрицательной");
        }
    }

    public void spend(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Сумма траты должна быть положительной");
        }
        if (amount > money) {
            throw new IllegalArgumentException("Недостаточно средств");
        }
        money -= amount;
    }
}
