package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WalletTest {

    @Test
    void testSpend() {
        Wallet wallet = new Wallet("Иван", 100);
        wallet.spend(50);
        assertEquals(50, wallet.getMoney());
    }

    @Test
    void testSpendMoreThanBalance() {
        Wallet wallet = new Wallet("Иван", 100);
        wallet.spend(150);
        assertEquals(100, wallet.getMoney());
    }

    @Test
    void testSetMoney() {
        Wallet wallet = new Wallet("Иван", 100);
        wallet.setMoney(200);
        assertEquals(200, wallet.getMoney());
    }

    @Test
    void testSetNegativeMoney() {
        Wallet wallet = new Wallet("Иван", 100);
        wallet.setMoney(-50);
        assertEquals(100, wallet.getMoney());
    }
}
