package Inheritance;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee manager = new Manager("Alice", 101, 75000, 5);
        Employee developer = new Developer("Bob", 102, 60000, "Java");
        Employee intern = new Intern("Charlie", 103, 20000);

        manager.displayDetails();
        System.out.println("-----------------");
        developer.displayDetails();
        System.out.println("-----------------");
        intern.displayDetails();
    }
}
