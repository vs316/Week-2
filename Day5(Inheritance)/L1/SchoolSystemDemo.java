package Inheritance;

public class SchoolSystemDemo {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr. Smith", 40, "Mathematics");
        Student student = new Student("Alice", 16, "10th Grade");
        Staff staff = new Staff("Mrs. Johnson", 35, "Administration");

        teacher.displayRole();
        student.displayRole();
        staff.displayRole();
    }
}
