package Projects.NumberGame;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

  public static boolean playRound() {
    // Step 1: Generate a random number within a specified range
    Random random = new Random();
    int number = random.nextInt(100) + 1; // Generates a number between 1 and 100
    int attempts = 0;
    int maxAttempts = 10;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to the Number Guessing Game!");
    System.out.println("I have generated a random number between 1 and 100. You have 10 attempts to guess it.");

    // Step 2 and 3: Prompt user to guess and compare with generated number
    while (attempts < maxAttempts) {
      System.out.print("Attempt " + (attempts + 1) + "/" + maxAttempts + ": Enter your guess: ");
      int guess = scanner.nextInt();
      attempts++;

      if (guess == number) {
        System.out
            .println("Congratulations! You guessed the correct number " + number + " in " + attempts + " attempts.");
        return true;
      } else if (guess < number) {
        System.out.println("Your guess is too low. Try again.");
      } else {
        System.out.println("Your guess is too high. Try again.");
      }
    }

    System.out.println("Sorry, you've used all " + maxAttempts + " attempts. The correct number was " + number + ".");
    return false;
  }

  public static void main(String[] args) {
    int totalRounds = 0;
    int totalWins = 0;
    Scanner scanner = new Scanner(System.in);

    while (true) {
      // Play a round and track score
      if (playRound()) {
        totalWins++;
      }
      totalRounds++;

      // Step 6: Ask if the user wants to play another round
      System.out.print("Would you like to play another round? (yes/no): ");
      String playAgain = scanner.next().toLowerCase();

      if (!playAgain.equals("yes")) {
        break;
      }
    }

    // Step 7: Display the user's score (rounds won)
    System.out.println("\nGame Over! You played " + totalRounds + " rounds and won " + totalWins + " rounds.");
  }
}
