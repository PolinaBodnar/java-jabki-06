package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SystemOrderTest {

    @Test
    void testAddItemIncreasesTotalPrice() {
        SystemOrder order = new SystemOrder();
        order.addItem("Товар 1", 100.0);
        order.addItem("Товар 2", 150.0);

        String details = order.getOrderDetails();
        assertTrue(details.contains("Товар 1"));
        assertTrue(details.contains("Товар 2"));
        assertTrue(details.contains("Общая стоимость: 250.0"));
    }

    @Test
    void testUniqueOrderId() {
        SystemOrder order1 = new SystemOrder();
        SystemOrder order2 = new SystemOrder();
        assertNotEquals(order1.getOrderDetails(), order2.getOrderDetails());
    }
}
