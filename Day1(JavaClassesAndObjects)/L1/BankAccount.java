package JavaClassAndObjects;

import java.util.Scanner;

public class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();
        account.accountHolder = "Alice Johnson";
        account.accountNumber = 12345;
        account.balance = 1000.00; // Example initial balance

        System.out.println("Welcome " + account.accountHolder + ", Account Number: " + account.accountNumber);
        account.displayBalance();

        System.out.println("Enter deposit amount:");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        System.out.println("Enter withdrawal amount:");
        double withdrawalAmount = sc.nextDouble();
        account.withdraw(withdrawalAmount);

        account.displayBalance();
        sc.close();
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Method to display current balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}