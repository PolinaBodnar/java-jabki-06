//package org.example.ordersystem;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class OrderSystem {
//    private static int orderIdCounter = 1;
//    private int orderId;
//    private List<String> items;
//    private double totalPrice;
//
//    public OrderSystem() {
//        this.orderId = orderIdCounter++;
//        this.items = new ArrayList<>();
//        this.totalPrice = 0;
//    }
//
//    public void addItem(String item, double price) {
//        items.add(item);
//        totalPrice += price;
//    }
//
//    public String getOrderDetails() {
//        StringBuilder details = new StringBuilder("Заказ #" + orderId + "\nТовары:\n");
//        for (String item : items) {
//            details.append(item).append("\n");
//        }
//        details.append("Общая стоимость: ").append(totalPrice);
//        return details.toString();
//    }
//
//    public List<String> getItems() {
//        return items;
//    }
//
//    public double getTotalPrice() {
//        return totalPrice;
//    }
//}
