package com;

// Custom Exception for Insufficient Balance
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to withdraw money
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount < 0) {
            throw new IllegalArgumentException("Invalid amount! Amount cannot be negative.");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }

    // Method to get balance
    public double getBalance() {
        return balance;
    }
}

public class BankSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000); // Initial balance: 1000

        try {
            System.out.println("Current balance: " + account.getBalance());

            // Test Cases:
            account.withdraw(200);  // Valid withdrawal
            account.withdraw(1200); // Insufficient balance
            account.withdraw(-50);  // Invalid negative amount

        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Transaction completed.");
    }
}

