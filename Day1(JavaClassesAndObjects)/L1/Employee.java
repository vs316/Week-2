package JavaClassAndObjects;

import java.util.Scanner;

public class Employee {
    String name;
    int id;
    double salary;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee details: ");
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        // Create employee object and set details
        Employee employee = new Employee();
        employee.setDetails(name, id, salary);

        // Display the details
        employee.displayDetails();
        sc.close();
    }

    // Method to set employee details
    public void setDetails(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println(" Employee Details: ");
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Salary : " + salary);
    }
}