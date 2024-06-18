import java.util.Scanner;
class Course {
    String courseName;
    String courseCode;
    int marks;
    public Course(String courseName, String courseCode, int marks) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.marks = marks;
    }
    public String getGrade() {
        if (marks >= 90) {
            return "S";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}
class Student {
    String name;
    String registerNumber;
    Course[] courses;
    public Student(String name, String registerNumber, int numberOfCourses) {
        this.name = name;
        this.registerNumber = registerNumber;
        this.courses = new Course[numberOfCourses];
    }
    public void addCourse(int index, Course course) {
        courses[index] = course;
    }
    public void printGradeSheet() {
        System.out.println("Student Register Number: " + registerNumber);
        System.out.println("Student Name: " + name);
        System.out.println("Grade Sheet:");
        System.out.println("Course Code\tCourse Name\tMarks\tGrade");
        for (Course course : courses) {
            System.out.println(course.courseCode + "\t" + course.courseName + "\t" + course.marks + "\t" + course.getGrade());
        }
    }
}
public class GradeSheet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student register number: ");
        String registerNumber = scanner.nextLine();
        System.out.print("Enter number of courses: ");
        int numberOfCourses = scanner.nextInt();
        scanner.nextLine();
        Student student = new Student(name, registerNumber, numberOfCourses);
        for (int i = 0; i < numberOfCourses; i++) {
            System.out.print("Enter course name: ");
String courseName = scanner.nextLine();
System.out.print("Enter course code: ");
String courseCode = scanner.nextLine();
System.out.print("Enter marks obtained: "); 
int marks = scanner.nextInt();
scanner.nextLine(); 
Course course = new Course(courseName, courseCode, marks);
student.addCourse(i, course);
}
student.printGradeSheet();
scanner.close();
}
}
