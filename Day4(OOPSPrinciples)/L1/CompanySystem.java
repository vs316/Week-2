package ObjectModelingContinued;

public class CompanySystem {
    public static void main(String[] args) {
        Company company = new Company("TechCorp");
        Department department1 = new Department("IT");
        Department department2 = new Department("HR");

        Employee emp1 = new Employee("John");
        Employee emp2 = new Employee("Mary");

        department1.addEmployee(emp1);
        department2.addEmployee(emp2);

        company.addDepartment(department1);
        company.addDepartment(department2);
        company.displayCompanyDetails();
    }
}
