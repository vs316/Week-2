package ObjectModelingContinued;

// Main class to demonstrate functionality
public class SchoolManagementSystem {
    public static void main(String[] args) {
        // Create a school
        School mySchool = new School("Green Valley High School");

        // Create students
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Add students to school
        mySchool.addStudent(student1);
        mySchool.addStudent(student2);

        // Create courses
        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        // Enroll students in courses
        student1.enrollCourse(math);
        student1.enrollCourse(science);
        student2.enrollCourse(math);

        // Display school students
        mySchool.showStudents();

        // Display courses for each student
        student1.viewCourses();
        student2.viewCourses();

        // Display students in each course
        math.viewStudents();
        science.viewStudents();
    }
}
