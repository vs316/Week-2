package ObjectModelingContinued;

public class UniversityManagementSystem {
    public static void main(String[] args) {
        University myUniversity = new University("SRM University");
        // Create departments
        Departments computerScience = new Departments("Computer Science");
        Departments mathematics = new Departments("Mathematics");

        // Add departments to the university
        myUniversity.addDepartment(computerScience);
        myUniversity.addDepartment(mathematics);

        // Display departments
        myUniversity.showDepartments();

        // Create faculty members
        Faculty faculty1 = new Faculty("Dr. Alice");
        Faculty faculty2 = new Faculty("Dr. Bob");

        // Display faculty details (independent of departments)
        faculty1.showFacultyDetails();
        faculty2.showFacultyDetails();

        // Delete the university, demonstrating composition
        myUniversity.deleteUniversity();
    }


}
