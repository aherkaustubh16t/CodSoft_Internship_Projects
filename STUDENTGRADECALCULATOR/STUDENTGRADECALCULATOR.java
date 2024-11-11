package Projects.STUDENTGRADECALCULATOR;

import java.util.Scanner;

public class STUDENTGRADECALCULATOR {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Number of subjects
    System.out.print("Enter the number of subjects: ");
    int numberOfSubjects = scanner.nextInt();

    // Initialize variables
    int totalMarks = 0;
    double averagePercentage;
    String grade;

    // Step 1: Input marks for each subject and calculate total marks
    for (int i = 1; i <= numberOfSubjects; i++) {
      System.out.print("Enter marks obtained in subject " + i + " (out of 100): ");
      int marks = scanner.nextInt();
      totalMarks += marks; // Add marks to total
    }

    scanner.close();
    // Step 2: Calculate average percentage
    averagePercentage = (double) totalMarks / numberOfSubjects;

    // Step 3: Grade calculation based on average percentage
    if (averagePercentage >= 90) {
      grade = "A";
    } else if (averagePercentage >= 80) {
      grade = "B";
    } else if (averagePercentage >= 70) {
      grade = "C";
    } else if (averagePercentage >= 60) {
      grade = "D";
    } else {
      grade = "F";
    }

    // Step 4: Display the results
    System.out.println("\n--- Results ---");
    System.out.println("Total Marks: " + totalMarks + "/" + (numberOfSubjects * 100));
    System.out.println("Average Percentage: " + averagePercentage + "%");
    System.out.println("Grade: " + grade);
  }
}
