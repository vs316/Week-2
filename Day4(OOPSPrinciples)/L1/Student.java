package ObjectModelingContinued;

import java.util.ArrayList;
import java.util.List;

// School class with aggregation relationship to Student
class School {
    private String name;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showStudents() {
        System.out.println("Students in school " + name + ":");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }
}

// Student class with association to Course
class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course course) {
        courses.add(course); // Student enrolls in the course
        course.addStudent(this); // Add the student to the course
    }

    public void viewCourses() {
        System.out.println("Courses for " + name + ":");
        for (Course course : courses) {
            System.out.println("- " + course.getName());
        }
    }
}

// Course class with association to Student
class Course {
    private String name;
    private List<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void viewStudents() {
        System.out.println("Students enrolled in course " + name + ":");
        for (Student student : students) {
            System.out.println("- " + student.getName());
        }
    }
}

