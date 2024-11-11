package Projects.QUIZAPPLICATIONWITHTIMER;

public class Main {
  public static void main(String[] args) {
    // Create quiz questions
    QuizQuestion q1 = new QuizQuestion(
        "What is the capital of France?",
        new String[] { "Paris", "London", "Berlin", "Madrid" },
        "Paris");
    QuizQuestion q2 = new QuizQuestion(
        "Which planet is known as the Red Planet?",
        new String[] { "Earth", "Mars", "Jupiter", "Saturn" },
        "Mars");
    QuizQuestion q3 = new QuizQuestion(
        "Who wrote 'To Kill a Mockingbird'?",
        new String[] { "Harper Lee", "J.K. Rowling", "Ernest Hemingway", "George Orwell" },
        "Harper Lee");

    // Store all questions in an array
    QuizQuestion[] questions = { q1, q2, q3 };

    // Initialize the quiz game
    QuizGame quizGame = new QuizGame(questions);

    // Start the quiz
    quizGame.startQuiz();
  }
}
