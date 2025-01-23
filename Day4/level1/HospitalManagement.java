package level1;
import java.util.ArrayList;
import java.util.List;

// Doctor Class
class Doctor {
    String name;
    
    Doctor(String name) {
        this.name = name;
    }
    
    public void consult(Patient patient) {
        System.out.println("Dr. " + name + " is consulting " + patient.getName() + ".");
        System.out.println("Consultation completed for " + patient.getName() + ".");
    }
    
    public String getName() {
        return name;
    }
}

// Patient Class
class Patient {
    String name;
    
    Patient(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    //for visits
     public void visitDoctor(Doctor doctor) {
        doctor.consult(this);
    }
}

// Hospital Class
class Hospital {
    String hospitalName;
    List<Doctor> doctors;
    List<Patient> patients;
    
    Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }
    
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }
    
    public void addPatient(Patient patient) {
        patients.add(patient);
    }
    
     public void showHospitalDetails() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println("- Dr. " + doctor.getName());
        }
        System.out.println("Patients:");
        for (Patient patient : patients) {
            System.out.println("- " + patient.getName());
        }
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        // Create a hospital
        Hospital hospital = new Hospital("MegaCity Hospital");
        
        // doctors
        Doctor doctor1 = new Doctor("Dr.sharma");
        Doctor doctor2 = new Doctor("Dr.singh");
        
        // patients
        Patient patient1 = new Patient("Dev");
        Patient patient2 = new Patient("Aditya");
        
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        
        hospital.showHospitalDetails();
        
        patient1.visitDoctor(doctor1); 
        patient2.visitDoctor(doctor2);  
        patient1.visitDoctor(doctor2);  
    }
}
/*
       +-----------------------------------+        1     *       +-----------------------------+     *     *      +----------------------------+
       |    Hospital                      |----------------------|     Doctor                   |-----------------|     Patient                 |
       +----------------------------------+                      +------------------------------+                +------------------------------+
       | - hospitalName: String           |                      | - name: String              |                 | - name: String              |
       | - doctors: List<Doctor>          |                      +-----------------------------+                 +-----------------------------+
       | - patients: List<Patient>        |                     | + consult(patient: Patient) |                 | + visitDoctor(doctor: Doctor)|
       +----------------------------------+                     |  +getName():String          |                 |  +getName():String           |
       | + addDoctor(doctor: Doctor)      |                     |                             |                 +------------------------------+
       | + addPatient(patient: Patient)   |                     |                             |                            |
       | + showHospitalDetails()          |                     |                             |                            |
       +----------------------------------+                     +-----------------------------+                            |
                       | 1                                                   | 1                                           | *                             
                       |                                                     | *                                           |                                 
                   (Association)                                      (Association)                                   (Association)                   
                       |                                                     |                                             |                                 
                       +-----------------------------------------------------+---------------------------------------------+
                                                 (Doctors and Patients can have multiple relationships)

*/