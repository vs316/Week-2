package ObjectModelingContinued;

import java.util.ArrayList;
import java.util.List;

class University {
    private String name;
    private List<Departments> departments;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Departments department) {
        departments.add(department);
    }

    public void deleteUniversity() {
        departments.clear();//Removing all departments (composition relationship)
        System.out.println("University deleted, and its departments are removed.");
    }

    public void showDepartments() {
        System.out.println("Departments in " + name + ":");
        for (Departments department : departments) {
            System.out.println("- " + department.getName());
        }
    }

}

class Departments {
    private String name;

    public Departments(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public void showFacultyDetails() {
        System.out.println("Faculty name: " + name);
    }
}

