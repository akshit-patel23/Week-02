package problemstatement.employeemanagement;

public class PartTimeEmployee extends Employee implements Department{
    private String department;
    private int perHour;
    private String typeOfEmployment="Part Time job";

    PartTimeEmployee(int employeeId,int baseSalary,String name,int perHour){
        super(employeeId,baseSalary,name);
        this.perHour=perHour;

    }
    public double calculateSalary(){
        return perHour*super.getSalary();
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("The salary of employer :- "+calculateSalary());
        System.out.println("Type of Employment :-"+typeOfEmployment);
    }

    @Override
    public void assignDepartment(String department) {
        Department.super.assignDepartment(department);
        this.department=department;
    }


    public void getDepartmentDetails() {
        Department.super.getDepartmentDetails(department);
    }
}