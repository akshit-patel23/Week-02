package problemstatement.employeemanagement;
public abstract class Employee {
    private int employeeId,baseSalary;
    private String name;


    public Employee(int employeeId,int baseSalary,String name){
        this.baseSalary=baseSalary;
        this.employeeId=employeeId;
        this.name=name;
    }
    public int getEmployeeId(){
        return employeeId;

    }
    public int getSalary(){
        return baseSalary;
    }

    public void setEmployeeId(int employeeId){
        this.employeeId=employeeId;

    }
    public abstract double calculateSalary();
    public void displayDetails(){
        System.out.println("The EmployerID of employee :- "+employeeId);
        System.out.println("The name of employee :- "+name);
        System.out.println("The Base Salary of employee :- "+baseSalary);


    };





}

