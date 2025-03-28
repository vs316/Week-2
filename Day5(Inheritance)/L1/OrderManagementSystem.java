package Inheritance;

public class OrderManagementSystem {
    public static void main(String[] args) {
        Order order = new Order(1001, "2025-03-01");
        Order shippedOrder = new ShippedOrder(1002, "2025-03-02", "TRK123456");
        Order deliveredOrder = new DeliveredOrder(1003, "2025-03-03", "TRK654321", "2025-03-05");

        System.out.println(order.getOrderStatus());
        System.out.println(shippedOrder.getOrderStatus());
        System.out.println(deliveredOrder.getOrderStatus());
    }
}
