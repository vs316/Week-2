package ObjectModelingContinued;

import java.util.ArrayList;
import java.util.List;

class Students {
    private String name;

    public Students(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Courses course) {
        course.addStudent(this);
        System.out.println(name + " has enrolled in " + course.getName());

    }
}

class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void assignCourse(Courses course) {
        course.setProfessor(this);
        System.out.println(name + " is assigned to teach " + course.getName());

    }
}

class Courses {
    private String name;
    private Professor professor;
    private List<Students> students;

    public Courses(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void addStudent(Students student) {
        students.add(student);
    }

    public void showStudents() {
        System.out.println("Students enrolled in " + name + ":");
        for (Students student : students) {
            System.out.println("- " + student.getName());
        }
    }

}