package com.multilevelinheritance.RetailOrderManagement;

public class Main {
    public static void main(String[] args) {
        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD123", "2025-01-20", "TRK98765", "2025-01-23");
        deliveredOrder.getOrderStatus();
    }
}
