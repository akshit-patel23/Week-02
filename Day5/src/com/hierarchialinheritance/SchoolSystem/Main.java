package com.hierarchialinheritance.SchoolSystem;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Vishal Sir", 40, "Mathematics");
        Student student = new Student("Akshit", 15, "10th Grade");
        Staff staff = new Staff("Satya Prakash", 35, "Administration");

        System.out.println("--- Teacher Details ---");
        teacher.displayDetails();
        teacher.displayRole();

        System.out.println("\n--- Student Details ---");
        student.displayDetails();
        student.displayRole();

        System.out.println("\n--- Staff Details ---");
        staff.displayDetails();
        staff.displayRole();
    }
}
