package com.multilevelinheritance.CourseHierarchy;

public class Main {
    public static void main(String[] args) {
        PaidOnlineCourse paidCourse = new PaidOnlineCourse(
                "Java Programming",
                40,
                "Udemy",
                true,
                199.99,
                20
        );
        paidCourse.displayDetails();
    }

}
