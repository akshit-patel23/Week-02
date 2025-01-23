package level1;
import java.util.ArrayList;
import java.util.List;

// Course Class
class Course {
    private String name;
    private List<Student> enrolledStudents;

    public Course(String name) {
        this.name = name;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
        }
    }

    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
}

// Student Class
class Student {
    private String name;
    private List<Course> enrolledCourses;

    public Student(String name) {
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollInCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            course.enrollStudent(this); // Maintain two-way association
        }
    }

    public List<Course> getEnrolledCourses() {
        return enrolledCourses;
    }
}

// School Class
class School {
    private String name;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public List<Student> getStudents() {
        return students;
    }
}

// Main Class to Demonstrate
public class SchoolManagement {
    public static void main(String[] args) {
        // Create School
        School school = new School("Greenfield Academy");

        // Create Students
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Add Students to School
        school.addStudent(student1);
        school.addStudent(student2);

        // Create Courses
        Course course1 = new Course("Mathematics");
        Course course2 = new Course("Science");

        // Enroll Students in Courses
        student1.enrollInCourse(course1);
        student1.enrollInCourse(course2);
        student2.enrollInCourse(course1);

        // Demonstrate Relationships
        System.out.println("Students in School: ");
        for (Student student : school.getStudents()) {
            System.out.println("- " + student.getName());
        }

        System.out.println("\nCourses for Alice:");
        for (Course course : student1.getEnrolledCourses()) {
            System.out.println("- " + course.getName());
        }

        System.out.println("\nStudents in Mathematics:");
        for (Student student : course1.getEnrolledStudents()) {
            System.out.println("- " + student.getName());
        }
    }
}
