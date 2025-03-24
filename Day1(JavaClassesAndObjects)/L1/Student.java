package JavaClassAndObjects;

public class Student {
    String name;
    int rollNumber;
    int marks;

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "John Doe";
        student.rollNumber = 101;
        student.marks = 85; // Example marks
        student.displayDetails();
    }

    // Method to calculate grade based on marks
    public String calculateGrade() {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to display student details and grade
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}