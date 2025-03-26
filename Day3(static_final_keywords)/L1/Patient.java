package EnhancedJavaClassesAndObjects;

class Patient {
    static String hospitalName = "City Hospital";
    private static int totalPatients = 0;
    private final int patientID;
    private String name, ailment;
    private int age;

    // Constructor using 'this'
    public Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    // Static method to count total patients
    public static int getTotalPatients() {
        return totalPatients;
    }

    // Method to display patient details after instanceof check
    public void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        }
    }
}