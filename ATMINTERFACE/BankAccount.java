package Projects.ATMINTERFACE;

public class BankAccount {
  private double balance;

  // Constructor to initialize the account with an initial balance
  public BankAccount(double initialBalance) {
    if (initialBalance >= 0) {
      balance = initialBalance;
    } else {
      balance = 0;
    }
  }

  // Method to get the current balance
  public double getBalance() {
    return balance;
  }

  // Method to deposit money into the account
  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
    } else {
      System.out.println("Deposit amount must be positive.");
    }
  }

  // Method to withdraw money from the account
  public boolean withdraw(double amount) {
    if (amount > 0 && amount <= balance) {
      balance -= amount;
      return true;
    } else {
      System.out.println("Insufficient balance or invalid withdrawal amount.");
      return false;
    }
  }
}
