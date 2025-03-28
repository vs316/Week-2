package Inheritance.RestaurantManagement;

public class RestaurantManagementSystem {
    public static void main(String[] args) {
        Worker chef = new Chef("Gordon", 1);
        Worker waiter = new Waiter("Emily", 2);
        chef.performDuties();
        waiter.performDuties();
    }
}
