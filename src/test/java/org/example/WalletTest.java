package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WalletTest {

    @Test
    void testSetMoneyWithPositiveAmount() {
        Wallet wallet = new Wallet("Иван", 100.0);
        wallet.setMoney(200.0);  // Устанавливаем положительное значение
        assertEquals(200.0, wallet.getMoney(), "Баланс должен быть 200.0");
    }

    @Test
    void testSetMoneyWithNegativeAmount() {
        Wallet wallet = new Wallet("Иван", 100.0);
        wallet.setMoney(-50.0);  // Попытка установить отрицательное значение
        assertEquals(100.0, wallet.getMoney(), "Баланс не должен измениться при отрицательном значении");
    }

    @Test
    void testSetMoneyWithZero() {
        Wallet wallet = new Wallet("Иван", 100.0);
        wallet.setMoney(0.0);  // Установка нулевого баланса
        assertEquals(0.0, wallet.getMoney(), "Баланс должен быть 0.0");
    }
}
