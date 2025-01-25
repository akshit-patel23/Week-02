package com.assistedproblems.EmployeeManagementSystem;

public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager("Akshit", 101, 90000, 10);
        Employee developer = new Developer("Deepak", 102, 75000, "Java");
        Employee intern = new Intern("Ujjwal", 103, 20000, 6);

        manager.displayDetails();
        System.out.println();
        developer.displayDetails();
        System.out.println();
        intern.displayDetails();
    }

}
