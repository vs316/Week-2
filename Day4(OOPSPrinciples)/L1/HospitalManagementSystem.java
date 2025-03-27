package ObjectModelingContinued;

// Main class to demonstrate functionality
public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Create a hospital
        Hospital myHospital = new Hospital("City Hospital");

        // Create doctors
        Doctor doctor1 = new Doctor("Alice");
        Doctor doctor2 = new Doctor("Bob");

        // Create patients
        Patient patient1 = new Patient("John");
        Patient patient2 = new Patient("Emily");

        // Add doctors and patients to the hospital
        myHospital.addDoctor(doctor1);
        myHospital.addDoctor(doctor2);
        myHospital.addPatient(patient1);
        myHospital.addPatient(patient2);

        // Simulate consultations
        doctor1.consult(patient1);
        doctor2.consult(patient1);
        patient2.consultDoctor(doctor2);

        // Display hospital doctors and patients
        myHospital.showDoctors();
        myHospital.showPatients();

        // Show consultations for each doctor and patient
        doctor1.showPatients();
        doctor2.showPatients();
        patient1.showDoctors();
        patient2.showDoctors();
    }
}
