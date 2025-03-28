package Inheritance;

//Hierarchical inheritance
public class BankAccountSystem {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("SA123", 5000, 3.5);
        BankAccount checking = new CheckingAccount("CA456", 3000, 1000);
        BankAccount fixedDeposit = new FixedDepositAccount("FD789", 10000);

        savings.displayAccountType();
        checking.displayAccountType();
        fixedDeposit.displayAccountType();
    }
}
