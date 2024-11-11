package Projects.STUDENTCOURSEREGISTRATIONSYSTEM;

import java.util.HashMap;
import java.util.Map;

public class StudentDatabase {
  private Map<String, Student> students;

  // Constructor to initialize the student database
  public StudentDatabase() {
    this.students = new HashMap<>();
  }

  // Add a new student to the database
  public void addStudent(Student student) {
    students.put(student.getStudentID(), student);
  }

  // Get a student by student ID
  public Student getStudentByID(String studentID) {
    return students.get(studentID);
  }
}
