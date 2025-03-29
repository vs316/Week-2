package OOPS;

import java.util.ArrayList;
import java.util.List;

// Main class
public class PatientManagementSystem {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();
        patients.add(new InPatient(101, "Alice", 45));
        patients.add(new OutPatient(102, "Bob", 30));

        for (Patient patient : patients) {
            patient.getPatientDetails();
            System.out.println("Total Bill: " + patient.calculateBill());
            if (patient instanceof MedicalRecord) {
                MedicalRecord record = (MedicalRecord) patient;
                record.addRecord("Diabetes Diagnosis");
                System.out.println(record.viewRecords());
            }
            System.out.println();
        }
    }
}