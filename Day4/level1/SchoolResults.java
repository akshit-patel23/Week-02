package level1;
import java.util.ArrayList;
import java.util.List;

// Subject Class
class Subject {
    private String name;
    private double score;

    public Subject(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }
}

// Student Class
class Student {
    private String name;
    private List<Subject> subjects;

    public Student(String name) {
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addSubject(String subjectName, double score) {
        subjects.add(new Subject(subjectName, score));
    }

    public List<Subject> getSubjects() {
        return subjects;
    }
}

// GradeCalculator Class
class GradeCalculator {
    public static String calculateGrade(Student student) {
        List<Subject> subjects = student.getSubjects();
        double totalScore = 0;

        for (Subject subject : subjects) {
            totalScore += subject.getScore();
        }

        double averageScore = totalScore / subjects.size();

        if (averageScore >= 90) {
            return "A";
        } else if (averageScore >= 80) {
            return "B";
        } else if (averageScore >= 70) {
            return "C";
        } else if (averageScore >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}

// Main Class to Demonstrate
public class SchoolResults {
    public static void main(String[] args) {
        // Create a Student
        Student student = new Student("Akshit");
        student.addSubject("Mathematics", 85);
        student.addSubject("Science", 90);
        student.addSubject("History", 78);

        // Calculate Grade
        String grade = GradeCalculator.calculateGrade(student);
        System.out.println("Student: " + student.getName());
        System.out.println("Grade: " + grade);
    }
}
