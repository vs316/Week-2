package OOPS;

// Interface MedicalRecord
interface MedicalRecord {
    void addRecord(String record);

    String viewRecords();
}

// Abstract class Patient
abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    // Constructor
    protected Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Getters
    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Abstract method to calculate bill
    public abstract double calculateBill();

    // Concrete method to display patient details
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// InPatient subclass
class InPatient extends Patient implements MedicalRecord {
    private static final double DAILY_RATE = 5000;
    private String medicalHistory;

    public InPatient(int patientId, String name, int age) {
        super(patientId, name, age);
    }

    @Override
    public double calculateBill() {
        return DAILY_RATE * 5; // Fixed bill for 5 days
    }

    @Override
    public void addRecord(String record) {
        medicalHistory = record;
    }

    @Override
    public String viewRecords() {
        return "Medical History: " + medicalHistory;
    }
}

// OutPatient subclass
class OutPatient extends Patient {
    private static final double CONSULTATION_FEE = 1000;

    public OutPatient(int patientId, String name, int age) {
        super(patientId, name, age);
    }

    @Override
    public double calculateBill() {
        return CONSULTATION_FEE; // Fixed consultation fee
    }
}

