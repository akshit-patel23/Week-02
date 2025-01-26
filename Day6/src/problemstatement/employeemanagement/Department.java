package problemstatement.employeemanagement;

public interface Department {
    default void assignDepartment(String department){
        getDepartmentDetails(department);
    }
    default void getDepartmentDetails(String deparment){
        System.out.println("Assigned Department :- "+deparment);
    };

}
