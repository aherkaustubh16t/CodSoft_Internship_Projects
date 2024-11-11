package Projects.STUDENTCOURSEREGISTRATIONSYSTEM;

import java.util.ArrayList;
import java.util.List;

public class Student {
  private String studentID;
  private String name;
  private List<Course> registeredCourses;

  // Constructor to initialize the student
  public Student(String studentID, String name) {
    this.studentID = studentID;
    this.name = name;
    this.registeredCourses = new ArrayList<>();
  }

  public String getStudentID() {
    return studentID;
  }

  public String getName() {
    return name;
  }

  // Register the student for a course
  public boolean registerForCourse(Course course) {
    if (!course.isFull() && !registeredCourses.contains(course)) {
      registeredCourses.add(course);
      course.registerStudent();
      return true;
    }
    return false;
  }

  // Drop a course the student is registered for
  public void dropCourse(Course course) {
    if (registeredCourses.contains(course)) {
      registeredCourses.remove(course);
      course.dropStudent();
    }
  }

  // List all courses the student is registered for
  public void listCourses() {
    if (registeredCourses.isEmpty()) {
      System.out.println(name + " is not registered for any courses.");
    } else {
      System.out.println(name + "'s Registered Courses:");
      for (Course course : registeredCourses) {
        System.out.println(course.getTitle() + " (" + course.getCourseCode() + ")");
      }
    }
  }
}
