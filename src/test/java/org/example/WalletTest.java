import org.example.wallet.Wallet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WalletTest {

    @Test
    public void testWalletCreation() {
        Wallet wallet = new Wallet("Иван", 100);
        assertEquals("Иван", wallet.getOwner());
        assertEquals(100, wallet.getMoney());
    }

    @Test
    public void testSpendMoney() {
        Wallet wallet = new Wallet("Иван", 100);
        wallet.spend(50);
        assertEquals(50, wallet.getMoney());
    }

    @Test
    public void testSpendMoreThanAvailable() {
        Wallet wallet = new Wallet("Иван", 100);
        assertThrows(IllegalArgumentException.class, () -> wallet.spend(150));
    }

    @Test
    public void testNegativeAmount() {
        Wallet wallet = new Wallet("Иван", 100);
        assertThrows(IllegalArgumentException.class, () -> wallet.spend(-10));
    }
}
