package sample;

class BankAccount {
    private String accountHolder;
    private double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }
}

public class encapsulation {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount("Rahul", 1000.0);

        System.out.println("Account Holder: " + acc.getAccountHolder());
        System.out.println("Starting Balance: " + acc.getBalance());

        acc.deposit(500);
        System.out.println("Balance after deposit: " + acc.getBalance());

        acc.withdraw(300);
        System.out.println("Balance after withdrawal: " + acc.getBalance());

        acc.withdraw(2000);
    }
}
