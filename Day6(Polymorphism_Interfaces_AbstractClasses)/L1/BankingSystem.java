package OOPS;

import java.util.ArrayList;
import java.util.List;

// Main Class
public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();

        // Adding Savings and Current accounts
        accounts.add(new SavingsAccount(1001, "Alice", 10000));
        accounts.add(new CurrentAccount(2001, "Bob", 3000));

        // Processing accounts
        for (BankAccount account : accounts) {
            System.out.println("Account Holder: " + account.getHolderName());
            System.out.println("Interest: " + account.calculateInterest());
            if (account instanceof CurrentAccount) {
                CurrentAccount current = (CurrentAccount) account;
                System.out.println("Loan Eligibility: " + (current.calculateLoanEligibility() ? "Eligible" : "Not Eligible"));
            }
            System.out.println();
        }
    }
}