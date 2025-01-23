package level1;
import java.util.*;

public class CompanyManage {
    public static void main(String args[]) {
        Company c = new Company("Capgemini");
        c.addDept("SDE");
        c.addDept("HR");

        // adding employees
        c.setterEmp("SDE", "Kunal");
        c.setterEmp("HR", "Akshit Patel");

        c.showDetails();
    }
}

class Company {
    private String name;
    private ArrayList<Department> dept = new ArrayList<Department>();

    Company(String name) {
        this.name = name;
        this.dept = new ArrayList<>();
    }

    public void addDept(String d) {
        dept.add(new Department(d));
    }

    public void setterEmp(String dName, String eName) {
        for (Department d : dept) {
            if (dName.equals(d.name)) {
                d.addEmp(eName);
            }
        }
    }

    public void showDetails() {
        System.out.println("Company: " + name);
        for (Department d : dept) {
            d.show();
        }
    }
}

class Department {
    private ArrayList<Employee> emp = new ArrayList<Employee>();
    public String name;

    Department(String name) {
        this.name = name;
        this.emp = new ArrayList<>();
    }

    public void addEmp(String obj) {
        emp.add(new Employee(obj));
    }

    public void show() {
        System.out.println("Department: " + name);
        for (Employee s : emp) {
            System.out.println("Employee: " + s.getName());
        }
    }
}

class Employee {
    private String name;

    Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
