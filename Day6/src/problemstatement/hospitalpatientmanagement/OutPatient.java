package problemstatement.hospitalpatientmanagement;

import java.util.ArrayList;

public class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private ArrayList<String> medicalRecords = new ArrayList<>();

    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
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
        System.out.println("Type :- Out-Patient");
        System.out.println("Consultation Fee :- " + consultationFee);
    }
}