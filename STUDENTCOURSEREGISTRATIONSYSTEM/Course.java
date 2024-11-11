package Projects.STUDENTCOURSEREGISTRATIONSYSTEM;

public class Course {
  private String courseCode;
  private String title;
  private String description;
  private int capacity;
  private int enrolledStudents;
  private String schedule;

  // Constructor to initialize the course
  public Course(String courseCode, String title, String description, int capacity, String schedule) {
    this.courseCode = courseCode;
    this.title = title;
    this.description = description;
    this.capacity = capacity;
    this.enrolledStudents = 0; // initially no students are enrolled
    this.schedule = schedule;
  }

  // Getter methods for course properties
  public String getCourseCode() {
    return courseCode;
  }

  public String getTitle() {
    return title;
  }

  public String getDescription() {
    return description;
  }

  public int getCapacity() {
    return capacity;
  }

  public int getEnrolledStudents() {
    return enrolledStudents;
  }

  public String getSchedule() {
    return schedule;
  }

  // Method to register a student for the course (if capacity is available)
  public boolean registerStudent() {
    if (enrolledStudents < capacity) {
      enrolledStudents++;
      return true;
    }
    return false;
  }

  // Method to drop a student from the course
  public void dropStudent() {
    if (enrolledStudents > 0) {
      enrolledStudents--;
    }
  }

  // Check if the course is full
  public boolean isFull() {
    return enrolledStudents >= capacity;
  }

  @Override
  public String toString() {
    return "Course Code: " + courseCode + "\nTitle: " + title + "\nDescription: " + description +
        "\nCapacity: " + capacity + "\nEnrolled: " + enrolledStudents + "\nSchedule: " + schedule;
  }
}
