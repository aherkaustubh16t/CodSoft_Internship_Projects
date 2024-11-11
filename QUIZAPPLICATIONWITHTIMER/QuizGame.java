package Projects.QUIZAPPLICATIONWITHTIMER;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class QuizGame {
  private QuizQuestion[] questions;
  private int currentQuestionIndex;
  private int score;
  private boolean isAnswered;

  // Constructor to initialize quiz questions
  public QuizGame(QuizQuestion[] questions) {
    this.questions = questions;
    this.currentQuestionIndex = 0;
    this.score = 0;
    this.isAnswered = false;
  }

  // Method to start the quiz
  public void startQuiz() {
    Scanner scanner = new Scanner(System.in);

    while (currentQuestionIndex < questions.length) {
      // Show the current question
      showQuestion(questions[currentQuestionIndex]);

      // Start the timer
      startTimer();

      // Wait for the user's answer
      String userAnswer = scanner.nextLine();
      if (userAnswer.equalsIgnoreCase(questions[currentQuestionIndex].getCorrectAnswer())) {
        score++;
      }

      // Move to the next question
      currentQuestionIndex++;
    }

    // Display final result
    showResult();
  }

  // Method to display the question and options
  private void showQuestion(QuizQuestion question) {
    System.out.println(question.getQuestion());
    String[] options = question.getOptions();
    for (int i = 0; i < options.length; i++) {
      System.out.println((i + 1) + ". " + options[i]);
    }
  }

  // Method to start a timer for each question
  private void startTimer() {
    Timer timer = new Timer();
    timer.schedule(new TimerTask() {
      @Override
      public void run() {
        if (!isAnswered) {
          System.out.println("\nTime's up!");
          currentQuestionIndex++;
          isAnswered = true;
        }
      }
    }, 10000); // 10 seconds per question
  }

  // Method to show the result at the end
  private void showResult() {
    System.out.println("\nQuiz Finished!");
    System.out.println("Your final score: " + score + "/" + questions.length);
    System.out.println("Correct Answers: " + score);
    System.out.println("Incorrect Answers: " + (questions.length - score));
  }
}
