//package org.example;
//
//import org.example.ordersystem.OrderSystem;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class OrderSystemTest {
//
//    @Test
//    public void testAddItem() {
//        OrderSystem order = new OrderSystem();
//        order.addItem("Товар 1", 50.0);
//        order.addItem("Товар 2", 150.0);
//
//        assertEquals(2, order.getItems().size());
//        assertEquals(200.0, order.getTotalPrice());
//    }
//
//    @Test
//    public void testOrderDetails() {
//        OrderSystem order = new OrderSystem();
//        order.addItem("Товар 1", 50.0);
//        order.addItem("Товар 2", 150.0);
//
//        String details = order.getOrderDetails();
//        assertTrue(details.contains("Заказ #"));
//        assertTrue(details.contains("Товар 1"));
//        assertTrue(details.contains("Общая стоимость: 200.0"));
//    }
//}
