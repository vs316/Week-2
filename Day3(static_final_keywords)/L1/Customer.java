package EnhancedJavaClassesAndObjects;

public class Customer {
    private String name;
    private double balance;

    public Customer(String name) {
        this.name = name;
        this.balance = 0.0;
    }

    public void viewBalance() {
        System.out.println(name + "'s Balance: INR " + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(name + " deposited: INR " + amount);
    }
}

class Bank {
    private String name;

    public Bank(String name) {
        this.name = name;
    }

    public void openAccount(Customer customer) {
        System.out.println("Account opened for " + customer + " in " + name);
    }

}


