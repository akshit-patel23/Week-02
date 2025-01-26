package problemstatement.hospitalpatientmanagement;

import java.util.ArrayList;

public class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyRate;
    private ArrayList<String> medicalRecords = new ArrayList<>();

    public InPatient(int patientId, String name, int age, int daysAdmitted, double dailyRate) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyRate;
    }

    @Override
    public void addRecord(String record) {
        medicalRecords.add(record);
    }

    @Override
    public ArrayList<String> viewRecords() {
        return medicalRecords;
    }

    @Override
    public void getPatientDetails() {
        super.getPatientDetails();
        System.out.println("Type :- In-Patient");
        System.out.println("Days Admitted :- " + daysAdmitted);
        System.out.println("Daily Rate :- " + dailyRate);
    }
}