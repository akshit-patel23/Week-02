package level1;
import java.util.ArrayList;
import java.util.List;

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }

    public void displayFaculty() {
        System.out.println("Faculty Name: " + name);
    }
}

class Department {
    String departmentName;
    List<Faculty> faculties;

    Department(String departmentName) {
        this.departmentName = departmentName;
        faculties = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void displayDepartment() {
        System.out.println("Department: " + departmentName);
        for (Faculty faculty : faculties) {
            faculty.displayFaculty();
        }
    }
}

class University {
    String universityName;
    List<Department> departments;

    University(String universityName) {
        this.universityName = universityName;
        departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void displayUniversity() {
        System.out.println("University: " + universityName);
        for (Department department : departments) {
            department.displayDepartment();
        }
    }

    public void deleteUniversity() {
        System.out.println("Deleting University: " + universityName);
	departments.clear();  }
}

public class UniversityManagementCode {
    public static void main(String[] args) {
        Faculty faculty1 = new Faculty("Dr. Smith");
        Faculty faculty2 = new Faculty("Dr. Johnson");
        Faculty faculty3 = new Faculty("Dr. White");

        Department dept1 = new Department("Computer Science");
        Department dept2 = new Department("Mathematics");

        dept1.addFaculty(faculty1);
        dept1.addFaculty(faculty2);
        dept2.addFaculty(faculty2);
        dept2.addFaculty(faculty3);

        University university = new University("Tech University");

        university.addDepartment(dept1);
        university.addDepartment(dept2);

        university.displayUniversity();

         university.deleteUniversity();

        System.out.println("\nAfter deleting the university:");
        university.displayUniversity(); 
}
}
