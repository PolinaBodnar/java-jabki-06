package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    void testAddItemIncreasesTotalPrice() {
        Order order = new Order();
        order.addItem("Товар 1", 100.0);
        order.addItem("Товар 2", 150.0);

        String details = order.getOrderDetails();
        assertTrue(details.contains("Товар 1"));
        assertTrue(details.contains("Товар 2"));
        assertTrue(details.contains("Общая стоимость: 250.0"));
    }

    @Test
    void testUniqueOrderId() {
        Order order1 = new Order();
        Order order2 = new Order();
        assertNotEquals(order1.getOrderDetails(), order2.getOrderDetails());
    }
}
