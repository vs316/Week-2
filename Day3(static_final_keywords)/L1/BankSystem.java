package EnhancedJavaClassesAndObjects;

public class BankSystem {
    public static void main(String[] args) {
        Bank bank = new Bank("National Bank");
        Customer customer1 = new Customer("Alice");
        bank.openAccount(customer1);
        customer1.deposit(10000.0);
        customer1.viewBalance();

    }
}
