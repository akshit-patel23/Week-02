package com.multilevelinheritance.CourseHierarchy;

public class PaidOnlineCourse extends Course{
    private double fee;
    private double discount; // in percentage

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        double finalPrice = fee - (fee * discount / 100);
        System.out.println("Fee: Rs " + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: Rs " + finalPrice);
    }

}
