package Projects.ATMINTERFACE;

public class Main {
  public static void main(String[] args) {
    // Initialize the bank account with an initial balance
    BankAccount account = new BankAccount(1000.0);

    // Create an ATM instance connected to the user's bank account
    ATM atm = new ATM(account);

    // Display the ATM menu and interact with the user
    atm.displayMenu();
  }
}
