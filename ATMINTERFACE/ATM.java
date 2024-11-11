package Projects.ATMINTERFACE;

import java.util.Scanner;

public class ATM {
  public BankAccount account;

  // Constructor to initialize the ATM with a bank account
  public ATM(BankAccount account) {
    this.account = account;
  }

  // Method to display the ATM menu and handle user input
  public void displayMenu() {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("\nWelcome to the ATM!");
      System.out.println("1. Withdraw");
      System.out.println("2. Deposit");
      System.out.println("3. Check Balance");
      System.out.println("4. Exit");
      System.out.print("Select an option (1-4): ");

      int choice = scanner.nextInt();

      switch (choice) {
        case 1:
          System.out.print("Enter amount to withdraw: ");
          double withdrawAmount = scanner.nextDouble(); // Input for withdrawal
          if (withdraw(withdrawAmount)) { // Use withdrawAmount here
            System.out.println("Withdrawal successful!");
          }
          break;
        case 2:
          System.out.print("Enter amount to deposit: ");
          double depositAmount = scanner.nextDouble();
          deposit(depositAmount);
          break;
        case 3:
          checkBalance();
          break;
        case 4:
          System.out.println("Thank you for using the ATM. Goodbye!");
          return;
        default:
          System.out.println("Invalid option. Please try again.");
      }
    }
  }

  // Method for withdrawing an amount
  private boolean withdraw(double amount) {
    return account.withdraw(amount); // Use amount here, as it's the parameter of this method
  }

  // Method for depositing an amount
  private void deposit(double amount) {
    account.deposit(amount);
    System.out.println("Deposit successful!");
  }

  // Method for checking the current balance
  private void checkBalance() {
    System.out.println("Your current balance is: $" + account.getBalance());
  }
}
