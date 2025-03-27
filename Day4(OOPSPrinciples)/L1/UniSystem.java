package ObjectModelingContinued;

public class UniSystem {


    public static void main(String[] args) {
        // Create students
        Students student1 = new Students("Alice");
        Students student2 = new Students("Bob");

        // Create professors
        Professor professor1 = new Professor("Dr. Smith");
        Professor professor2 = new Professor("Dr. Johnson");

        // Create courses
        Courses course1 = new Courses("Mathematics");
        Courses course2 = new Courses("Physics");

        // Professors assign courses
        professor1.assignCourse(course1);
        professor2.assignCourse(course2);

        // Students enroll in courses
        student1.enrollCourse(course1);
        student2.enrollCourse(course2);

        // Display students in courses
        course1.showStudents();
        course2.showStudents();
    }
}

