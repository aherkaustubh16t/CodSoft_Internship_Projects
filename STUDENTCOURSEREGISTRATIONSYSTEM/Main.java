package Projects.STUDENTCOURSEREGISTRATIONSYSTEM;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Initialize databases
    CourseDatabase courseDatabase = new CourseDatabase();
    StudentDatabase studentDatabase = new StudentDatabase();

    // Create and add courses
    courseDatabase.addCourse(new Course("CS101", "Introduction to Computer Science", "Basic programming concepts", 3,
        "Mon/Wed/Fri 10:00-11:00"));
    courseDatabase.addCourse(new Course("MATH201", "Calculus I", "Fundamentals of calculus", 2, "Tue/Thu 9:00-10:30"));

    // Create and add students
    Student student1 = new Student("S001", "Alice");
    Student student2 = new Student("S002", "Bob");
    studentDatabase.addStudent(student1);
    studentDatabase.addStudent(student2);

    // Menu system
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("\n1. Display Available Courses");
      System.out.println("2. Register for a Course");
      System.out.println("3. Drop a Course");
      System.out.println("4. List Registered Courses");
      System.out.println("5. Exit");

      System.out.print("Enter your choice: ");
      int choice = scanner.nextInt();
      scanner.nextLine(); // consume newline

      switch (choice) {
        case 1:
          courseDatabase.displayAvailableCourses();
          break;
        case 2:
          System.out.print("Enter student ID: ");
          String studentID = scanner.nextLine();
          Student student = studentDatabase.getStudentByID(studentID);
          if (student != null) {
            System.out.print("Enter course code to register: ");
            String courseCode = scanner.nextLine();
            Course course = courseDatabase.getCourseByCode(courseCode);
            if (course != null) {
              if (student.registerForCourse(course)) {
                System.out.println("Successfully registered for " + course.getTitle());
              } else {
                System.out.println("Course is full or already registered.");
              }
            } else {
              System.out.println("Invalid course code.");
            }
          } else {
            System.out.println("Invalid student ID.");
          }
          break;
        case 3:
          System.out.print("Enter student ID: ");
          studentID = scanner.nextLine();
          student = studentDatabase.getStudentByID(studentID);
          if (student != null) {
            System.out.print("Enter course code to drop: ");
            String dropCourseCode = scanner.nextLine();
            Course dropCourse = courseDatabase.getCourseByCode(dropCourseCode);
            if (dropCourse != null) {
              student.dropCourse(dropCourse);
              System.out.println("Successfully dropped " + dropCourse.getTitle());
            } else {
              System.out.println("Invalid course code.");
            }
          } else {
            System.out.println("Invalid student ID.");
          }
          break;
        case 4:
          System.out.print("Enter student ID: ");
          studentID = scanner.nextLine();
          student = studentDatabase.getStudentByID(studentID);
          if (student != null) {
            student.listCourses();
          } else {
            System.out.println("Invalid student ID.");
          }
          break;
        case 5:
          System.out.println("Exiting...");
          return;
        default:
          System.out.println("Invalid choice, try again.");
      }
    }
  }
}
