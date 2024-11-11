package Projects.QUIZAPPLICATIONWITHTIMER;

public class QuizQuestion {
  private String question;
  private String[] options;
  private String correctAnswer;

  // Constructor to initialize the question, options, and correct answer
  public QuizQuestion(String question, String[] options, String correctAnswer) {
    this.question = question;
    this.options = options;
    this.correctAnswer = correctAnswer;
  }

  public String getQuestion() {
    return question;
  }

  public String[] getOptions() {
    return options;
  }

  public String getCorrectAnswer() {
    return correctAnswer;
  }
}
