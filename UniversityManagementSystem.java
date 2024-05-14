
import java.util.ArrayList;
import java.util.List;

class Student {

    private final String name;
    private final int id;
    private final List<Course> enrolledCourses;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
    }

    public void dropCourse(Course course) {
        enrolledCourses.remove(course);
    }

    public double calculateGPA() {
        double totalCredits = 0;
        double totalGradePoints = 0;
        for (Course course : enrolledCourses) {
            totalCredits += course.getCredits();
            totalGradePoints += course.getCredits() * course.getGrade();
        }
        return totalGradePoints / totalCredits;
    }
}

class Course {

    private final String courseCode;
    private final String courseName;
    private final int credits;
    private double grade;

    public Course(String courseCode, String courseName, int credits) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCredits() {
        return credits;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}

public class UniversityManagementSystem {

    public static void main(String[] args) {
        // Create courses
        Course mathCourse = new Course("MATH101", "Introduction to Mathematics", 3);
        Course csCourse = new Course("CS101", "Introduction to Computer Science", 4);

        // Create students
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);

        // Enroll students in courses
        student1.enrollCourse(mathCourse);
        student1.enrollCourse(csCourse);
        student2.enrollCourse(mathCourse);

        // Set grades for courses
        mathCourse.setGrade(3.5);
        csCourse.setGrade(4.0);

        // Display GPA for each student
        System.out.println("GPA for " + student1.getName() + ": " + student1.calculateGPA());
        System.out.println("GPA for " + student2.getName() + ": " + student2.calculateGPA());

    }
}
