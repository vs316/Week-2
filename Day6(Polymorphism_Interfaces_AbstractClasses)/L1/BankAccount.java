package OOPS;

// Interface Loanable
interface Loanable {
    void applyForLoan(double loanAmount);

    boolean calculateLoanEligibility();
}

// Abstract class BankAccount
abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    // Constructor
    protected BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Getters and setters
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Abstract method
    public abstract double calculateInterest();
}

// SavingsAccount subclass
class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.04;

    public SavingsAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }
}

// CurrentAccount subclass
class CurrentAccount extends BankAccount implements Loanable {
    private static final double INTEREST_RATE = 0.01;
    private static final double MIN_BALANCE_FOR_LOAN = 5000;

    public CurrentAccount(int accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public void applyForLoan(double loanAmount) {
        System.out.println("Loan of " + loanAmount + " applied.");
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= MIN_BALANCE_FOR_LOAN;
    }
}


