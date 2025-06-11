package javaassign;

public class employee {
   
    int empId;
    String name;
    double salary;

    
    public employee(int id, String empName, double empSalary) {
        empId = id;
        name = empName;
        salary = empSalary;
    }

    
    public void displayDetails() {
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + name);
        System.out.println("Salary        : $" + salary);
    }

    
    public static void main(String[] args) {
       
        employee emp = new employee(1259016, "DSK", 85000.0);

        
        emp.displayDetails();
    }
}

