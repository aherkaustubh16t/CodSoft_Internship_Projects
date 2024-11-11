package Projects.STUDENTCOURSEREGISTRATIONSYSTEM;

import java.util.ArrayList;
import java.util.List;

public class CourseDatabase {
  private List<Course> courses;

  // Constructor to initialize the course database
  public CourseDatabase() {
    this.courses = new ArrayList<>();
  }

  // Add a new course to the database
  public void addCourse(Course course) {
    courses.add(course);
  }

  // Display all available courses
  public void displayAvailableCourses() {
    System.out.println("Available Courses:");
    for (Course course : courses) {
      if (!course.isFull()) {
        System.out.println(course);
      }
    }
  }

  // Find a course by course code
  public Course getCourseByCode(String courseCode) {
    for (Course course : courses) {
      if (course.getCourseCode().equals(courseCode)) {
        return course;
      }
    }
    return null;
  }
}
