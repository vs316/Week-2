package OOPS;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Adding FullTime and PartTime employees
        employees.add(new FullTimeEmployee(101, "Alice", 50000, 20000));
        employees.add(new PartTimeEmployee(102, "Bob", 20000, 20, 500));

        // Displaying employee details and their calculated salaries
        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Total Salary: " + emp.calculateSalary());
            System.out.println();

        }
    }
}
