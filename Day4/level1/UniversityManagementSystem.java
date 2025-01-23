package level1;
import java.util.ArrayList;
import java.util.List;

class Course {
    private int id;
    private String name;
    private Professor professor;
    private List<Student> students;

    public Course(int id, String name) {
        this.id = id;
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public void enrollStudent(Student student) {
        students.add(student);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Professor getProfessor() {
        return professor;
    }

    public List<Student> getStudents() {
        return students;
    }
}

class Professor {
    private int id;
    private String name;
    private List<Course> courses;

    public Professor(int id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void teachCourse(Course course) {
        courses.add(course);
        course.assignProfessor(this);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return courses;
    }
}

class Student {
    private int id;
    private String name;
    private List<Course> courses;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return courses;
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {

        List<Professor> professors = new ArrayList<>();
        List<Course> courses = new ArrayList<>();
        List<Student> students = new ArrayList<>();

        // Adding Professors
        Professor professor1 = new Professor(1, "Nischal Kaushal");
        Professor professor2 = new Professor(2, "Hemant Vyas");
        professors.add(professor1);
        professors.add(professor2);

        // Adding Courses
        Course course1 = new Course(101, "Computer Science 101");
        Course course2 = new Course(102, "Data Structures");
        courses.add(course1);
        courses.add(course2);

        // Assign Professors to Courses
        professor1.teachCourse(course1);
        professor2.teachCourse(course2);

        // Adding Students
        Student student1 = new Student(1, "Akshit");
        Student student2 = new Student(2, "Ujjwal");
        students.add(student1);
        students.add(student2);

        // Enroll Students in Courses
        student1.enrollCourse(course1);
        student2.enrollCourse(course2);

        // Display University Details
        System.out.println("\nUniversity Details:");

        // Professors
        System.out.println("\nProfessors:");
        for (Professor professor : professors) {
            System.out.println("Professor ID: " + professor.getId() + ", Name: " + professor.getName());
            System.out.println("Teaches Courses:");
            for (Course course : professor.getCourses()) {
                System.out.println("  - " + course.getName());
            }
        }

        // Courses
        System.out.println("\nCourses:");
        for (Course course : courses) {
            System.out.println("Course ID: " + course.getId() + ", Name: " + course.getName());
            System.out.println("Taught by: " + (course.getProfessor() != null ? course.getProfessor().getName() : "No Professor Assigned"));
            System.out.println("Enrolled Students:");
            for (Student student : course.getStudents()) {
                System.out.println("  - " + student.getName());
            }
        }

        // Students
        System.out.println("\nStudents:");
        for (Student student : students) {
            System.out.println("Student ID: " + student.getId() + ", Name: " + student.getName());
            System.out.println("Enrolled in Courses:");
            for (Course course : student.getCourses()) {
                System.out.println("  - " + course.getName());
            }
        }
    }
}
